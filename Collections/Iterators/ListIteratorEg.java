package Collections.Iterators;

import java.util.ArrayList;
import java.util.*;

public class ListIteratorEg {






        public static void main(String[] args) {
            ArrayList<Integer> a =  new ArrayList<>();

            a.add(1);
            a.add(2);
            a.add(3);
            a.add(4);

            ListIterator i = a.listIterator();
            while(i.hasNext())
            {
                int j = (int) i.next();
                if(j%2 == 0 )
                {
                    i.remove();
                }

                else {
                    i.set(7);

                }
            }

            System.out.println(a);
        }


    }


