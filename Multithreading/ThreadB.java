package Multithreading;

public class ThreadB extends Thread{

    int total = 0 ;
    public void run(){
        synchronized (this){
            System.out.println("Child thread executing ....");

            for(int i = 0; i<10; i++)
            {
                total  = total + i ;
            }

           this.notify();
        }

    }
}
