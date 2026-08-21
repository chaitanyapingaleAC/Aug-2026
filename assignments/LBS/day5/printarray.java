import java.util.Scanner;

public class printarray {

    public static void main(String []args){
        System.out.println("enter the elements in array");
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        arr[0]=sc.nextInt();
        arr[1]=sc.nextInt();
        arr[2]=sc.nextInt();
        arr[3]=sc.nextInt();
        arr[4]=sc.nextInt();
        

        // for(int i=0;i<=arr[4];i++){
        //     System.out.print(arr[i]);
        // }
        for(int i:arr){
            System.out.print(i);
        }
    }
    
}
