import java.util.Scanner;
public class sumnum {
    void sum(int a){
        int x=a;
        int sum=0;
        for(int i=1;i<=x;i++){
           sum+=i;
        }
        System.out.println("the sum of 1 to "+a+" is: "+sum);
    }
    public static void main(String []args){
        sumnum obj=new  sumnum();
        System.out.println("enter the number ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        obj.sum(a);
    }
}
