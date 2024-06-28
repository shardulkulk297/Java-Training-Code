package Multithreading;

import Collections.TreeSet.MulNames;

public class SynchronizedEg {

    public static void main(String[] args) {
        Display d = new Display();
        MyThreadSync m = new MyThreadSync(d, "Kolhli");
        MyThreadSync m1 = new MyThreadSync(d, "sam");

        m.start();
        m1.start();

    }

}
