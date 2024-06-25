package ExceptionHandling;

public class Tryy {

    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }

        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }


        System.out.println("pOKEMON");

        m1();
    }

    public static int m1() {
        try {
            int a = 5;
        } catch (Exception e) {
            if (a==5){
                return 1;
            }

        }
        System.out.println(-"pokemon");
        return 0;
    }

}
