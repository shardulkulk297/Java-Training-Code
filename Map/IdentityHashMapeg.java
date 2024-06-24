package Map;

import java.util.IdentityHashMap;

public class IdentityHashMapeg {

    public static void main(String[] args) {
        IdentityHashMap i = new IdentityHashMap();
        String s1 = new String("shubh");
        String s2 = new String("shubh");
        i.put(s1, "Kohli" );
        i.put(s2, "Dhoni");

        System.out.println(i);
    }
}
