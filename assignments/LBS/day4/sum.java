

import java.util.Scanner;
class sum{


     void calculate(int a, int b) {
               int x=a;
               int y=b;
               int result=x+y;
               System.out.println("sum is :"+result);
        }


    public static void main(String []args){

        System.out.println("enter the first number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("enter the second number");
        int b=sc.nextInt();

        sum obj1=new sum();
        obj1.calculate(a,b);
    

       
    }
}