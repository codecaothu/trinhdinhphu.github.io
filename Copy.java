package BTVN_T2;

public class Copy {
    public static void main(String[] args) {

    }

    public static int[] copyOf(int [] array) {
        int [] new_array = new int [array.length];
        for (int i = 0; i < array.length; i++) {
            new_array[i] = array[i];
        }
        return new_array;
    }
}
