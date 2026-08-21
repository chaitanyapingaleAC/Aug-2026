import java.util.Scanner;
public class reversestring {
    public static void main(String []args){
        System.out.println("enter the string");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println("reverse string is:");
        for(int i=s.length()-1; i>=0;i--){
            System.out.print(s.charAt(i));
        }

    }
}
