import java.util.Scanner;

public class largestelement {
    
    public static void main(String []args){
        System.out.println("enter 5 elements in array");
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        for(int b=0;b<5;b++){
            arr[b]=sc.nextInt();
        }

    int largest=0;
        for(int i=0;i<5;i++){
           if(arr[i]>largest){
            largest=arr[i];
           }
        }
        System.out.println("largest element is "+largest);
    }
}
