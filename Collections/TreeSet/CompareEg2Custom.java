package Collections.TreeSet;

import java.util.TreeSet;

public class CompareEg2Custom {

    public static void main(String[] args) {
        TreeSet t = new TreeSet(new CustomSort());

        t.add(6);
        t.add(0);
        t.add(4);
        t.add(19);
        t.add(8);
        t.add(3);
        t.add(5);

        System.out.println(t);

    }
}


