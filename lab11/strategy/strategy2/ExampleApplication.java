package lab11.strategy.strategy2;

import java.util.Scanner;

public class ExampleApplication {
    public static void main(String[] args) {
        Context context = new Context();
        Scanner in = new Scanner(System.in);
        System.out.print("Input a : ");
        int a = in.nextInt();
        System.out.print("Input b : ");
        int b = in.nextInt();
        System.out.println("Input Operation");
        String c = in.next();
        in.close();

        switch (c) {
            case "+" -> context.setStrategy(new ConcreteStrategyAdd());
            case "-" -> context.setStrategy(new ConcreteStrategySubtract());
            case "*" -> context.setStrategy(new ConcreteStrategyMultiply());
        }
        System.out.println("result :" + context.executeStrategy(a, b));

    }
}
