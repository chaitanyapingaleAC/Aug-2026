import java.util.Arrays;
import java.util.Scanner;
public class indexofelement {
    
    public static void main(String []args){

        System.out.println("enter 5 elements:");
        Scanner sc=new Scanner(System.in);
        int arr[] = new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();

        }

        System.out.println("enter number to search");
        int num=sc.nextInt();

        int result=Arrays.binarySearch(arr, num);

        if(result>=0){
            System.out.println("the "+num+" was found on index "+result);
        }
        else System.out.println("not found");


    }
}
