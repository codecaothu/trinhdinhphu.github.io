package BTVN_T4;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void bubbleSort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
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
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
