package lab11.singleton.example;

public class Ball {
    private static Ball instance;
    private String color;

    private Ball() {
    }

    public Ball(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public static Ball getInstance(String color) {
        if (instance == null) {
            instance = new Ball(color);
        }
        return instance;
    }
}
