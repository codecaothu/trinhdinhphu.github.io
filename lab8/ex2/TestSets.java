package lab8.ex2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import static lab8.ex2.Sets.*;

public class TestSets {
    public static void main(String[] args) {
        Set<Integer> s1 = new TreeSet<>();
        Set<Integer> s2 = new HashSet<>();
        s1.add(1);
        s1.add(3);
        s1.add(5);
        s2.add(5);
        s2.add(6);
        s2.add(7);
        s2.add(8);
        System.out.println("Set1 : " + s1);
        System.out.println("Set2 : " + s2);
        System.out.println("Get union of 2 sets : " + unionManual(s1, s2));
        System.out.println("Let see all recurring char of 'seesafeag'");
        System.out.println(allRecurringChars("seesafeag"));
        System.out.println("Get first Set1 : " + getFirst((TreeSet<Integer>) s1));
        toArray(s1);
        System.out.println("To arr Set 1 : " + s1);

    }
}
