package lab6_exercise1.exercise1_2;

public class TestMain {
    public static void main(String[] args) {
        Student student = new Student("Nam","Ha Noi", "OOP", 2,1000);
        Staff staff=new Staff("Nam","Ha Noi","HUS",1000);

        System.out.println(student);
        System.out.println(staff);

        staff.setAddress("Viet Nam");
        staff.setPay(2000);
        System.out.println(staff);
    }
}
