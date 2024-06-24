package Collections.Stack;

import java.util.Stack;

public class StackEg {

    public static void main(String[] args) {
        Stack <Integer> s = new Stack<Integer>();

        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println(s.peek());
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s.isEmpty());
        System.out.println(s.search(2));


    }
}
