package Multithreading;

public class MyRunnableTest {

    public static void main(String[] args) {
        RuInterface r = new RuInterface();
        Thread t = new Thread(r);
        t.start();

        for(int i=0; i<5; i++)
        {
            System.out.println("Sammed is pokemon");
        }


    }
}
