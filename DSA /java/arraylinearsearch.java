
import java.util.*;
public class arraylinearsearch {
    public static void main(String args[]){
        int arr[]={23,44,5,12,45,77,98,45,67,92,22};
        int key=67;
        linearsearch(arr,key);
    }
    public static void linearsearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println("array element fund on index:"+i);
            }
            

        }
        
    }
}
