package lab8.ex1;

import java.util.*;

public class Lists {

    public static void insertFirst(ArrayList<Integer> list, int value){
        list.add(0,value);
    }

    public static void insertLast(ArrayList<Integer> list, int value){
        list.add( value);
    }

    public static void replace(ArrayList<Integer> list, int value){
        if (list.size() < 3){
            return;
        }
        list.set(2, value);
    }

    public static void removeThird(ArrayList<Integer> list){
        if (list.size() < 3){
            return;
        }
        list.remove(2);
    }

    public static void removeEvil(ArrayList<Integer> list){
        list.removeAll(List.of(666));
    }

    public static ArrayList<Integer> generateSquare(){
        List<Integer> lists = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i++) {
            lists.add(i * i);
        }
        return (ArrayList<Integer>) lists;
    }

    public static boolean contains(ArrayList<Integer> list, int value){
        int n = list.size();
        int i = 0;
        while (i < n){
            if (list.get(i) == value){
                return true;
            }
        }
        return false;
    }

    public static void copy(ArrayList<Integer> source, ArrayList<Integer> target){
        if (target == null){
            return;
        }
        //target.addAll(source);
        target.clear();
        for (int i : source){
            target.add(i);
        }
    }

    public static void reverse(ArrayList<Integer> list){
        Collections.reverse(list);
    }

    public static void reverseManual(ArrayList<Integer> list){
        for (int i = 0; i < list.size() / 2; i++){
            int tmp = list.get(i);
            list.set(i, list.get(list.size() - 1 - i));
            list.set(list.size() - 1 - i, tmp );
        }
    }

    public static void insertBeginningEnd(LinkedList<Integer> list, int value){
        list.addFirst(value);
        list.addLast(value);
    }



}
