package Map;

import java.sql.SQLOutput;
import java.util.*;

public class HashMapEg {
    public static void main(String[] args) {
        HashMap h = new HashMap();

        System.out.println(h.put(1, "pokemon"));
        System.out.println(h.put(2, "Ash"));
        System.out.println(h.put(1, "Misty"));

        System.out.println(h);

        Set allkeys = h.keySet();
        Collection allvalues = h.values();
        Set allentrys = h.entrySet();

        System.out.println(allkeys);
        System.out.println(allvalues);
        System.out.println(allentrys);

        Iterator i = allentrys.iterator();

        while(i.hasNext())
        {
            Map.Entry allkeyvalues = (Map.Entry) i.next();
            if (allkeyvalues.getKey().equals(2))
            {
                allkeyvalues.setValue("Pokemon");
            }
        }

        System.out.println(h);
    }
}
