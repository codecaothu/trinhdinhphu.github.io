package BTVN_T2;

public class Search {
    public static void main(String[] args) {

    }
    public static int search(int[]array,int key){
        for (int i = 0; i < array.length; i++) {
            if (array[i]==key){
                return i;
            }
        }
        return -1;
    }
}
