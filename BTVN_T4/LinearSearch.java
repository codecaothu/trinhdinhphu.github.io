package BTVN_T4;

import java.util.Scanner;

public class LinearSearch {
    public static boolean linearSearch(int[] array, int key) {
        for (int i : array) {
            if (i == key) {
                return true;
            }
        }
        return false;
    }
    public static int linearSearchIndex(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int a;
        int [] array;

        System.out.print("Nhap do dai cua mang: ");
        a = sc.nextInt();
        array = new int [a];

        if (array.length > 0){
            System.out.print("Nhap gia tri cua mang: ");
            for (int i = 0; i < array.length; i++){
                array[i] = sc.nextInt();
            }
        }
        System.out.println(linearSearch(array, 10));
        System.out.println(linearSearch(array, 0));
        System.out.println(linearSearchIndex(array, 10));
        System.out.println(linearSearchIndex(array, 0));
    }
}
