package Collections.Iterators;

import java.util.ArrayList;
import java.util.Iterator;

public class Iteratoreg {

    public static void main(String[] args) {
        ArrayList <Integer> a =  new ArrayList<>();

        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);

        Iterator i = a.iterator();
        while(i.hasNext())
        {
            int j = (int) i.next();
            if(j%2 == 0 )
            {
                System.out.println(j);
            }

            else {
                i.remove();

            }
        }

        System.out.println(a);
    }
}
