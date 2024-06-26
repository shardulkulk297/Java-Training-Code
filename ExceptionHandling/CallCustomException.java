package ExceptionHandling;

public class CallCustomException {

    public static void main(String[] args) {
        int age = 21;
        if(age > 18)
        {
            throw new CustomeException("Elligible for vote");
        }
        else
        {
            throw new CustomeException("Not Elligible for vote");
        }
    }
}
