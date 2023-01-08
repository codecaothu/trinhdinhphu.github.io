package BTVN_T4;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
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
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
