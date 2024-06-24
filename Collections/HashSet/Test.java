package Collections.HashSet;

import java.util.HashSet;

public class Test {

    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add('a');
        hs.add('a');

        System.out.println(hs);
        System.out.println(hs.add('a'));

        hs.add(hs.add(null));
        hs.add(hs.add(13));
                hs.add("Pokemon");

        System.out.println(hs);
    }
}
