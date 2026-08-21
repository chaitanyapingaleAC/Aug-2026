import java.util.Scanner;
public class palindrome {
    public static void main(String []args){
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the string");
      String original=sc.nextLine();
      String duplicate=new String();
      for(int i=original.length()-1;i>=0;i--){
        duplicate+=original.charAt(i);
      }
      // System.out.println(duplicate);
      if(original.equals(duplicate)){
        System.out.println(" string is palindrome");
      }
      else System.out.println("not palindrome");
    }
}
