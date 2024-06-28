package LeetCode;

public class ReverseInt {
    public static void main(String[] args) {
        int x = -123;
        int temp = 0;
        int value = 0;

        if(x > 0 || x < 0) {
            while (x != 0) {
                int digit = x % 10;
                temp = temp * 10 + digit;
                x = x / 10;

            }
        }

        System.out.println(temp);

    }
}
