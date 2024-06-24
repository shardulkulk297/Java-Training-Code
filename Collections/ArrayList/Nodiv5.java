package Collections.ArrayList;

import Inheritance.A;

import java.util.ArrayList;

public class Nodiv5 {
    public static void main(String[] args) {
        ArrayList <Integer> al = new ArrayList();
        ArrayList <Integer> al2 = new ArrayList();

        al.add(1);
        al.add(10);
        al.add(15);
        al.add(17);
        al.add(9);
        al.add(19);

//        for(int i=0; i<al.size(); i++)
//        {
//            if(al.indexOf(i) % 5==0)
//            {
//                System.out.println(al.get(i));
//            }
//
//        }

        for(Integer i: al )
        {
            if(i % 5 == 0){
                al2.add(i);
            }

        }

        System.out.println(al2);

    }
}
