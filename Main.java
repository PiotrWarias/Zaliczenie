import java.util.Scanner;
import static java.lang.Math.*;

class Main { 
  
public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String letter = scan.nextLine();
        char c = letter.charAt(0);
  if(c=='a'||c=='ą'||c=='u'||c=='o'||c=='e'||c=='i'||c=='ę'||c=='y'||c=='ó')
    {
      System.out.println("samogłoska");
    }
    else
    {
      System.out.println("spółgłoska");
    }
  }
}