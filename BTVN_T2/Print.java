package BTVN_T2;

public class Print {
    public static void main(String[] args) {
        int [] arr = new int[0];
        print(arr);
    }
    public static void print(int [] array){
        System.out.print("[");
        for (int i = 0;i < array.length;i++){
            if(i==0){
                System.out.print(array[i]);
            }
            else {
                System.out.print(", "+ array[i]);
            }
        }
        System.out.print("]");
    }
    public static void print(double [] array){
        System.out.print("[");
        for (int i = 0;i < array.length;i++){
            if(i==0){
                System.out.print(array[i]);
            }
            else {
                System.out.print(", "+ array[i]);
            }
        }
        System.out.print("]");
    }
    public static void print(float [] array){
        System.out.print("[");
        for (int i = 0;i < array.length;i++){
            if(i==0){
                System.out.print(array[i]);
            }
            else {
                System.out.print(", "+ array[i]);
            }
        }
        System.out.print("]");
    }
}
