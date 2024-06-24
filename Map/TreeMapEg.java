package Map;

import Collections.TreeSet.CustomSort;

import java.util.TreeMap;

public class TreeMapEg {

    public static void main(String[] args) {
        TreeMap t = new TreeMap(new CustomSort());

        t.put(100, "zzz");
        t.put(200, "YYY");
        t.put(99, "pokemon");

        System.out.println(t);
    }
}
