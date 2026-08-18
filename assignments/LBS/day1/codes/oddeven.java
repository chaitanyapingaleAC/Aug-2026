import java.util.*;
class oddeven{
       public static void main(String [] args){

        System.out.print("entr your number");
        Scanner sc=new Scanner(System.in);
          int num=sc.nextInt();
           String ss= (num%2==0)? "number is even":"number is odd";
         System.out.println(ss);

}



}