package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add("a");
        a.add("a"); //duplicates are allowed
        a.add("b"); //insertion order is preserved
        a.add(null);
        a.add("Pokemon"); //different datatypes are allowed
        System.out.println(a);

        Collections.synchronizedList(a);
    }
}
