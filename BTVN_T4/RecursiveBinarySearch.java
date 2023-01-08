package BTVN_T4;

import java.util.Scanner;

public class RecursiveBinarySearch {
    public static boolean binarySearch(int[] array, int key, int fromIdx, int toIdx) {
        int middleIdx = (fromIdx + toIdx) / 2;
        if (fromIdx > toIdx) {
            return false;
        }
        if (array[middleIdx] == key) {
            return true;
        }
        if (array[middleIdx] > key) {
            return binarySearch(array, key, fromIdx, middleIdx - 1);
        }
        return binarySearch(array, key, middleIdx + 1, toIdx);
    }

    public static boolean binarySearch(int[] array, int key) {
        return binarySearch(array, key, 0, array.length - 1);
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
        System.out.println(binarySearch(array, 5));
        System.out.println(binarySearch(array, 19));

    }
}
