package Constructor;

public class Test extends Parent {

    int i;
    String s;

    public static void main(String[] args) {
        Test t = new Test();
    }

    Test(){

//        this(10);
//        this("Pokemon");
        super();

    }
//
    Test(int i){
        System.out.println("Paramaterized constructor");
    }
//
//    Test(String s)
//    {
//        System.out.println("Printed pokemon");
//    }
}
