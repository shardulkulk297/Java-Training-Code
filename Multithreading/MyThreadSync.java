package Multithreading;

public class MyThreadSync extends Thread {

    Display d;
    String name;

    public MyThreadSync(Display d, String name)
    {
        this.d = d;
        this.name = name;
    }

    public void run()
    {
        d.wish(name);
    }
}
