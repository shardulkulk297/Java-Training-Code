public class StaticChange {
    int x = 200;
    static int y = 100;

    public static void main(String args[])
    {
        StaticChange s = new StaticChange();
        s.x = 456;
        s.y = 767;

        System.out.println(s.y);

        StaticChange s1 = new StaticChange();

        System.out.println(s1.x + "  " + s1.y);

        s1.x = 1110;

        s1.y = 500;

        System.out.println(s1.y + "" + s.y);

        System.out.println(s1.x + "" + s.x);
    }
}
