public class DateUtil {
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0) && !(year % 100 == 0) || (year % 400 == 0);
    }

    public static boolean isValidDate(int year, int month, int day) {
        if (year > 0 && year < 10000) {
            int[] month_list1 = {1, 3, 7, 5, 8, 10, 12};
            int[] month_list2 = {4, 6, 9, 11};
            if (isLeapYear(year)) {
                if (month == 2) {
                    if (day < 30 && 0 < day) return true;
                }
            } else {
                if (month == 2) {
                    if (day < 29 && 0 < day) return true;
                }
            }
            if (hasElement(month_list1, month)) {
                if (0 < day && day < 32) return true;
            }
            if (hasElement(month_list2, month)) {
                if (0 < day && day < 31) return true;
            }
        }
        return false;
    }

    public static int getDayOfWeek(int year, int month, int day) {
        String[] months_list = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        int[] day_in_month_list = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] numMonth = new int[months_list.length];
        for (int i = 0; i < months_list.length; i++) {
            numMonth[i] = i + 1;
        }
        int[] centuryList = {6, 4, 2, 0};
        int firstValue = 0;
        int fourthValue = 0;
        int secondValue, thirdValue, fifthValue;
        for (int i = 0; i < 4; i++) {
            int twoDigit = year / 100;
            if (twoDigit % 4 == 1) firstValue = centuryList[i];
        }

        secondValue = year % 100;
        thirdValue = secondValue / 4;
        int[] nonLeapYearArray = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
        int[] leapYearArray = {6, 2, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};

        if (isLeapYear(year)) {
            for (int i = 0; i < months_list.length; i++) {
                if (month == numMonth[i]) {
                    fourthValue = leapYearArray[i];
                }
            }
        } else {
            for (int i = 0; i < months_list.length; i++) {
                if (month == numMonth[i]) {
                    fourthValue = nonLeapYearArray[i];
                }
            }
        }
        fifthValue = day;
        int dayOfWeek = (firstValue + secondValue + thirdValue + fourthValue + fifthValue) % 7;
        return dayOfWeek;
    }

    private static boolean hasElement(int[] array, int num) {
        for (int n : array) {
            if (n == num) {
                return true;
            }
        }
        return false;
    }

    public static String toString(int year, int month, int day) {
        String[] daysName = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        String[] months_list = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        String theDay = null;
        String theMonth = null;
        for (int i = 0; i < daysName.length; i++) {
            if (getDayOfWeek(year, month, day) == i) {
                theDay = daysName[i];
            }
        }
        for (int i = 0; i < months_list.length; i++) {
            if (month == i) {
                theMonth = months_list[i - 1];
            }
        }
        return "[ Date: " + theDay + ", Day: " + day + ", Month: " + theMonth + ", Year: " + year + "]";
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(1900));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2011));
        System.out.println(isLeapYear(2012));

        System.out.println(isValidDate(2012, 2, 29));
        System.out.println(isValidDate(2011, 2, 29));
        System.out.println(isValidDate(2099, 12, 31));
        System.out.println(isValidDate(2099, 12, 32));

        System.out.println(getDayOfWeek(1982, 4, 24));
        System.out.println(getDayOfWeek(2000, 1, 1));
        System.out.println(getDayOfWeek(2054, 6, 19));
        System.out.println(getDayOfWeek(2012, 2, 17));

        System.out.println(toString(2012, 2, 14));
    }
}
