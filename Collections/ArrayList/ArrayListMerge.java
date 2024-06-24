package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListMerge {

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();

        a.add(1);
        a.add(2);
        a.add(3);

        ArrayList<Integer> a2 = new ArrayList<>();

        a2.add(4);
        a2.add(5);
        a2.add(6);

        a.addAll(a2);
        System.out.println(a);

//
//        Iterator i = a.listIterator();
//
//        int arr[] = a2.toArray();
//
//        while(i.hasNext())
//        {
//            for(int i=0; i<a2.size(); i++)
//            {
//                a.add(a2[0]);
//
//            }
//
//        }

    }
}
