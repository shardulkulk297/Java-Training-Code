package Multithreading;

public class Display {

    public static synchronized void wish(String name){ //class level lock using synchronized keyword
        for(int i = 0; i<5; i++)
        {
            System.out.println("Happy birthday" + name);
        }
    }
}
