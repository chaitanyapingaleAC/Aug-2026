import java.util.Scanner;
public class positivenegativearray {

    public static void main(String []args){

        System.out.println("enter 6 elements..");
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[6];
        for(int i=0;i<6;i++){
            arr[i]=sc.nextInt();
        }
      int countp=0;
      int countn=0;
      int countz=0;
        for(int i=0;i<6;i++){

            if(arr[i]>0){
                countp++;
            }
            else if(arr[i]<0){
                countn++;
            }
            else countz++;
        }
        System.out.println("positive numbers count "+countp);
        System.out.println("negative numbers count "+countn);
        System.out.println("count of zeros "+countz);

    }
    
}
