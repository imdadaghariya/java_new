package Prep;

import java.util.ArrayList;
import java.util.LinkedList;

public class inbuiltLinkedList {
    public static void main(String[] args) {
        LinkedList<String> mylist = new LinkedList<>();
        mylist.add("Imdad");
        mylist.add("Siraj");
        mylist.add("Musa");
        System.out.println(mylist.peekFirst());
        System.out.println(mylist.peekLast());
        mylist.addFirst("Kamyab");
        System.out.println(mylist.peekFirst());
        System.out.println(mylist.indexOf(mylist.get(0)));
        System.out.println(mylist.descendingIterator());

        ArrayList<Integer> arrlist = new ArrayList<>();
        arrlist.add(1);
        arrlist.add(1);
        arrlist.add(1);
        arrlist.add(1);
        arrlist.add(1);
        arrlist.add(1);
        int i =0;
        while(i<arrlist.size()){
            System.out.println(arrlist.get(i));
            i++;
        }


    }
}
