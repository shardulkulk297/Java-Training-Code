package Collections.HashSet.LinkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetEg {

    public static void main(String[] args) {
        LinkedHashSet hs = new LinkedHashSet();


        hs.add("a");
        hs.add(hs.add(null));
        hs.add(hs.add(13));
        hs.add("Pokemon");

        System.out.println(hs);

    }
}
