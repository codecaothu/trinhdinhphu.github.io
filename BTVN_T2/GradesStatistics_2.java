package BTVN_T2;

import java.util.Arrays;
import java.util.Scanner;

public class GradesStatistics_2 {
    public static int[] grades;

    public static void main(String[] args) {
        readGrades();
        print(grades);
        System.out.println("The average is " + average(grades));
        System.out.println("The median is " + median(grades));
        System.out.println("The minimum is " + min(grades));
        System.out.println("The maximum is " + max(grades));
        System.out.printf("The standard deviation is %.2f" , stdDev(grades));
    }

    public static void readGrades() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of student: ");
        int size = in.nextInt();
        grades = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the grade for student  " + (i + 1) + " : ");
            grades[i] = in.nextInt();
        }
    }

    public static void print(int[] array) {
        System.out.print("The grades are: ");
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print(array[i]);
            } else {
                System.out.print(", " + array[i]);
            }
        }
        System.out.print("]");
        System.out.println();
    }

    public static double average(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / array.length;
    }

    public static double median(int[] array) {
        Arrays.sort(array);
        if (array.length % 2 == 0) {
            return (double) (array[array.length / 2] + array[array.length / 2 + 1]) / 2;
        } else {
            return array[array.length / 2 + 1];
        }
    }

    public static int max(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            max = Math.max(max, array[i]);
        }
        return max;
    }

    public static int min(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            min = Math.min(min, array[i]);
        }
        return min;
    }

    public static double stdDev(int[] array) {
        double sum = 0.0, standardDeviation = 0.0;
        int length = array.length;

        for (int num : array) {
            sum += num;
        }

        double mean = sum / length;

        for (int num : array) {
            standardDeviation += Math.pow(num - mean, 2);
        }

        return Math.sqrt(standardDeviation / length);
    }
}
