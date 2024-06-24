package Collections.Queue;

import java.util.PriorityQueue;

public class Test {

    public static void main(String[] args) {
        PriorityQueue p = new PriorityQueue( new CustomSorting());

        p.offer(1);
        p.offer(189);
        p.offer(7);
        p.offer(27);

        System.out.println(p);
        System.out.println(p.peek());
        System.out.println(p.poll());
        System.out.println(p);

    }
}
