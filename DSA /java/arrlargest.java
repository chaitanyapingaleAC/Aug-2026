import java.util.*;
public  class arrlargest{
    public static void main(String args[]) {
        int arr[]={22,44,55,66,77,56,78,99,5};
        int large=largest(arr);
        System.out.println("largest no is:"+large);
    }
    public static int largest(int arr[]){
        int largeno=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]> largeno){
                largeno=arr[i];
                
            }
        }    return  largeno;

    }
}