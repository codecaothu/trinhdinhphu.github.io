package hw6.ex1_2;

public class MyTime {
    private int hour = 0;
    private int minute = 0;
    private int second = 0;

    public MyTime() {
    }

    public MyTime(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    public void setTime(int hour, int minute, int second)
    {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour >=0 && hour <= 23){
            this.hour =  hour;
        } else {
            throw new IllegalArgumentException("Invalid hour!");
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if(minute >= 0 && minute <= 59){
            this.minute = minute;
        }else {
            throw new IllegalArgumentException("Invalid minute!");
        }
    }

    public int getSecond() {
        return second;
    }
    public void setSecond(int second) {
        if(second >= 0 && second <= 59) {
            this.second = second;
        }else {
            throw new IllegalArgumentException("Invalid second!");
        }
    }

    @Override
    public String toString() {
        return String.format("%1$02d:%2$02d:%3$02d", hour, minute, second);
    }

    public MyTime nextSecond() {
        try {
            setTime(hour, minute, ++second);
            return this;
        }
        catch(IllegalArgumentException e) {}

        second = 0;
        return nextMinute();
    }

    public MyTime nextMinute()
    {
        try {
            setTime(hour, ++minute, second);
            return this;
        }
        catch(IllegalArgumentException e) {}

        minute = 0;
        return nextHour();
    }
    public MyTime nextHour() {
        try {
            setTime(hour, ++minute, second);
            return this;
        }
        catch(IllegalArgumentException e) {}

        minute = 0;
        return nextHour();
    }

    public MyTime previousSecond() {
        try {
            setTime(hour, minute, --second);
            return this;
        }
        catch(IllegalArgumentException e) {}

        second = 59;
        return previousMinute();
    }

    public MyTime previousMinute() {
        try {
            setTime(hour, --minute, second);
            return this;
        }
        catch(IllegalArgumentException e) {}

        minute = 59;
        return previousHour();
    }

    public MyTime previousHour() {
        try {
            setTime(--hour, minute, second);
            return this;
        }
        catch(IllegalArgumentException e) {}

        hour = 23;
        return this;
    }
}
