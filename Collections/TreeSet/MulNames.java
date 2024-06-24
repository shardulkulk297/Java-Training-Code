package Collections.TreeSet;

import java.util.TreeSet;

public class MulNames {

    public static void main(String[] args) {
        TreeSet <String> t =  new TreeSet<String>(new CustomSortNames());

        t.add("Shardul");
        t.add("Sammed");
        t.add("Pokemon");
        t.add("Ash");
        t.add("Sukhankar");

        System.out.println(t);
    }
}
