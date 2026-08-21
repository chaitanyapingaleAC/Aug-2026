import java.util.Arrays;
import java.util.Scanner;
public class sortarray {
    
    public static void main(String []args){

           System.out.println("enter 5 elements..");
           Scanner sc=new Scanner(System.in);
           int arr[]=new int[5];
           for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();

           }
           Arrays.sort(arr);
           System.out.println("sorted array are...");
            for(int i=0;i<5;i++){
                System.out.print(" "+arr[i]);
            }
    }

}
