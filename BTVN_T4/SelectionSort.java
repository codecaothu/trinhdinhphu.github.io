package BTVN_T4;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIdx = i ;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minIdx] > array[j]) {
                    minIdx = j;
                }
            }
            int tmp = array[i];
            array[i] = array[minIdx];
            array[minIdx] = tmp;
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
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }

}
