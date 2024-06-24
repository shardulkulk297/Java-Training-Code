package Collections.LinkedList;

import java.util.LinkedList;

public class LinkedListEg {

    public static void main(String[] args) {
        LinkedList <Integer>  l = new LinkedList<Integer>();

        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);

        l.add(0, 5);


        System.out.println(l);
    }
}
