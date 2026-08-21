import java.util.Arrays;
import java.util.Scanner;
public class checkelementinarray {

    public static void main(String []args){

        System.out.println("enter 5 element");
        Scanner sc=new Scanner(System.in);
        Integer arr[]=new Integer[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();

        }

        System.out.println("enter number to search");
        int num=sc.nextInt();

        if(Arrays.asList(arr).contains(num)){
            System.out.println("found");
        }
        else {System.out.println("not found");}

    }
    
}
