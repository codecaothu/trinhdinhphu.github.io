package BTVN_T2;

public class ToString {
    public static void main(String[] args) {
        int [] a ={1,2,3,4,5,6,7,8};
        System.out.println(arrayToString(a));
    }
    public static String arrayToString(int [] array){
        String str = "[";
        for (int i = 0; i < array.length;i++) {
            if (i == 0){
                String tmp = String.valueOf(array[i]);
                str = str.concat(tmp);
            }
            else {
                str = str.concat(", " + array[i]);
            }
        }
        str=str.concat("]");
        return str;
    }
}
