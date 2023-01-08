package lab8.ex2;

import java.util.*;

public class Sets {
    public static Set<Integer> intersectionManual(Set<Integer> first, Set<Integer> second){
        Set<Integer> set = new HashSet<>();
        for (Integer i : first){
            for (Integer j : second){
                if (i.equals(j)){
                    set.add(i);
                }
            }
        }
        return set;
    }

    public static Set<Integer> unionManual(Set<Integer> first, Set<Integer> second){
        Set<Integer> set = new HashSet<>();
        for (Integer i : first){
            set.add(i);
        }

        for (Integer i : second){
            set.add(i);
        }
        return set;
    }

    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second){
        Set<Integer> set = new HashSet<>(first);
        set.retainAll(second);
        return set;
    }

    public static Set<Integer> union(Set<Integer> first, Set<Integer> second){
        Set<Integer> set = new HashSet<>(first);
        set.addAll(second);
        return set;
    }

    public static List<Integer> toList (Set<Integer> source){
        List<Integer> toList = new ArrayList<Integer>();
        toList.addAll(source);
        return toList;
    }

    public static List<Integer> removeDuplicates(List<Integer> source){
        List<Integer> list = new ArrayList<>();
        list.addAll(source);

        ArrayList<Integer> list1 = (ArrayList<Integer>) removeDuplicates(list);
        return list1;
    }

    public static List<Integer> removeDuplicatesManual(List<Integer> source){
        List<Integer> list = new ArrayList<>();
        list.addAll(source);

        for (Integer i : list){
            for (Integer j : list){
                if (i.equals(j)){
                    list.remove(j);
                }
            }
        }
        return list;
    }

    public static String firstRecurringCharacter(String s){
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) ;
                return s.charAt(i) + "";
            }
        }
        return "";
    }

    public static Set<Character> allRecurringChars(String s) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j))
                    set.add(s.charAt(i));
            }
        }
        return set;
    }

    public static Integer[] toArray(Set<Integer> source) {
        Integer[] integers = new Integer[source.size()];
        int count = 0;
        for (Integer i : source) {
            integers[count] = i;
            ++count;
        }
        return integers;
    }

    public static int getFirst(TreeSet<Integer> source) {
        return source.first();
    }

    public static int getLast(TreeSet<Integer> source) {
        return source.last();
    }

    public static int getGreater(TreeSet<Integer> source, int value) {
        return source.ceiling(value);
    }


}
