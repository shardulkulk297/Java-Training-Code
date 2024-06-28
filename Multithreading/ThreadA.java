package Multithreading;

public class ThreadA {

    public static void main(String[] args) throws InterruptedException{
        ThreadB b = new ThreadB();
        ThreadA  a = new ThreadA();
        b.start();
        synchronized (b)
        {
            System.out.println("wait calling wait method");
            b.wait();
            System.out.println("Main thread notification");
            System.out.println(b.total);
        }

        for(int i = 0 ; i<5; i++)
        {

        }

    }
}
