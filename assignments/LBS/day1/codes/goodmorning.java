import java.util.*;
class goodmorning{
  public static void main(String [] args){

   System.out.print("enter time ");
   Scanner sc =new Scanner(System.in);
    int t=sc.nextInt();
    System.out.print("enter the shift am or pm");
    String s=sc.next();
    if(t>5&&t<12){
        if(s.equals("am") || s.equals("AM")){System.out.println("good morning");}
         
      }
    

  }



}