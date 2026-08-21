import java.util.Scanner;
public class even {
    public static void main(String []args){
        System.out.println("enter the number ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=1;i<=a;i++){
            System.out.print((i%2==0)? i:" ");
        }
    }
    
}
