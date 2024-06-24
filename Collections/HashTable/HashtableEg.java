package Collections.HashTable;

import java.sql.SQLOutput;
import java.util.Hashtable;

public class HashtableEg {
    public static void main(String[] args) {
        Hashtable hs = new Hashtable();

        hs.put(new temp(5), 'A');
        hs.put(new temp(15), 'B');
        hs.put(new temp(17), 'C');
        hs.put(new temp(8), 'D');
        hs.put(new temp(9), 'E');
        hs.put(new temp(16), 'F');

        System.out.println(hs);


    }
}

class temp {
    int i;

    public temp(int i){
        this.i = i;
    }

    public int hashCode(){return i;}

    @Override
    public String toString() {
        return "temp{" + "i=" + i + '}';
    }
}
