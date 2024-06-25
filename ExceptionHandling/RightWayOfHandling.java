package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class RightWayOfHandling {

    public static void main(String[] args) {
        m1();
    }

    public static void m1()
    {
        System.out.println("Pokemon");
        m2();
    }

    public static void m2(){

        try {
            PrintWriter p = new PrintWriter("pokemon.txt");

        }

        catch (FileNotFoundException f)
        {
            System.out.println(f);
        }

    }
}
