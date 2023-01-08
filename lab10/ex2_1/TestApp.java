package lab10.ex2_1;

public class TestApp {
    public static void main(String[] args){
        MyList arrayList = new MyArrayList();
        arrayList.add("a", 0);
        arrayList.add("b");
        arrayList.add("c", 0);
        arrayList.add("c", 3);
        arrayList.remove(3);
        System.out.println(arrayList.size());
        System.out.println(arrayList);
    }
}
