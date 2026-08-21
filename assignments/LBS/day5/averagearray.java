import java.util.Scanner;
public class averagearray {
    public static void main(String []args){

        System.out.println("enter 5 elements");
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<5;i++){
            sum +=arr[i];

        }
        System.out.println("the average of elements is "+sum/5);

    }
    
}
