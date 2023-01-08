package lab8.ex1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestLists {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(6);
        l1.add(4);
        List<Integer> l2 = new ArrayList<>();
        l2.add(4);
        l2.add(5);
        l2.add(6);
        l2.add(7);
        l2.add(8);
        l2.add(9);

        System.out.println("List 1 " + l1);
        System.out.println("List 2 " + l2);

        lab8.ex1.Lists test = new lab8.ex1.Lists();
        test.insertFirst((ArrayList<Integer>) l1, 5);
        System.out.println("After add" + " 5 " + "at beginning for list 1 : " + l1);
        System.out.println("Check contain value 5 : " + test.contains((ArrayList<Integer>) l1, 5));
        test.reverse((ArrayList<Integer>) l1);
        System.out.println("List1 after revesr: " + l1);
    }
}

