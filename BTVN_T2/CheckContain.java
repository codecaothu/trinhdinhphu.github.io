package BTVN_T2;

public class CheckContain {
    public static void main(String[] args) {

    }
    public static boolean contains(int [] array, int key){
        for (int i = 0; i < array.length; i++) {
            if(array[i]==key){
                return true;
            }
        }
        return false;
    }
}
