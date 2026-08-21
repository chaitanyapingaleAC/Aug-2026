import java.util.Scanner;

public class arraysum {
    public static void main(String []args){
        System.out.println("enter length of our array...");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("enter the elements.");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
           System.out.println("your array is");
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println(" ");
    int sum=0;
        for(int i=0;i<n;i++){
           sum+=arr[i];
        }
        System.out.println("sum of array is "+sum);
    }
    
}
