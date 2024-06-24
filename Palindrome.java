public class Palindrome {

    public static void main(String[] args) {
        String s = "101";

        int i=0;
        int j = s.length()-1;

      while(i<j)
      {
          if(s.charAt(i)!= s.charAt(j))
          {
              System.out.println("Not a palindrom");
          }
          else
          {
              System.out.println("palindrome");
          }
          i++;
          j--;
      }
    }
}
