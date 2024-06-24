package Collections.HashTable;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableEnum {

    public static void main(String[] args) {
        Hashtable hs = new Hashtable();

        hs.put(1, "Pokemon");
        hs.put(2, "Ash");

        Enumeration e = hs.elements();

        while(e.hasMoreElements())
        {
            String i = (String) e.nextElement();

            System.out.println(i);
        }

    }
}
