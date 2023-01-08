package BTVN_T2;

public class Reverse {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        reverse(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void reverse(int [] array) {
        for (int i = 0; i < array.length/2; i++) {
            int temp = array[i];
            array[i] = array[array.length-i-1];
            array[array.length - i - 1] = temp;
        }
    }
}
