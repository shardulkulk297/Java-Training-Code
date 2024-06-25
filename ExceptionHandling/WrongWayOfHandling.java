package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WrongWayOfHandling {

    public static void main(String[] args) throws FileNotFoundException {
        m1();
    }

    public static void m1() throws FileNotFoundException
    {
        System.out.println("Pokemon");
        m2();
    }

    public static void m2() throws FileNotFoundException{

        PrintWriter p = new PrintWriter("Pokemon.txt");

    }
}
