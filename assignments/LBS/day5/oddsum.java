
import java.util.Scanner;
public class oddsum {
    public static void main(String []Args){
        System.out.println("enter number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int sum=0;
        for(int i=0;i<=a;i++){
            if(i%2==0){
                continue;
            }
            else{
              sum+=i;
            }
        }
        System.out.println("sum of 1 to "+a+" number is "+sum);

    }
   
}
