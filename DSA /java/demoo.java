import java.util.Scanner.*;
public class demoo{
     public static void main(String []args){
     System.out.println("hello");
     int arr[]={2,4,5,6,7};
      pairs(arr);
 }

 public static void pairs( int arr[]){
    int totalpair=0;
    for(int i=0;i<arr.length;i++){
        int curr=arr[i];
        for(int j=i+1;j<arr.length;j++){
            System.out.print("("+arr[i]+","+arr[j]+")");
            totalpair++;
        }
        System.out.println(" ");
    }
    System.out.println("total pairs of arry is:"+totalpair);
 }
}

