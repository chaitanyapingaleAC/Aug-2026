
import java.util.Scanner;
public class stringprint {

    public static void main(String []args){
        System.out.println("enter 4 names");
        Scanner sc=new Scanner(System.in);
        String arr[]=new String[4];
        for(int i=0;i<4;i++){
            arr[i]=sc.nextLine();
        }
      System.out.println("your array is...");
        for(String name:arr){
            System.out.print(name+" ");
        }
    }
    
}
