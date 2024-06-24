package Collections.TreeSet;

import java.util.Comparator;

public class CustomSort implements Comparator {

    public int compare(Object o1, Object o2)
    {
        Integer i1 = (Integer) o1;
        Integer i2 = (Integer) o2;

        if(i1< i2){
            return 1;

        }

        else if(i1 > i2)
        {
            return -1;

        }

        else
            return 0;





    }
    //OR
//    return -i1.compareTo(i2);
    //IF return 1 is used then the sorting will happen in the order elements were inserted


}
