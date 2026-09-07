import java.util.*;
public class binarysearch{

    public static int binarysrch(int arr[],int key){
       int start=0;                                                    //declare the start and end points os array..
       int end = arr.length-1;

       while(start<=end){

         int mid = (start+end)/2;                                     //calculate mid point of arry for comparision..

          if(arr[mid]==key){                                          //if mid=key then elemnt found
            return mid;
          }
          if(arr[mid]<key){                                           //mid<key then found in right part hence update start point....
            start=mid+1;
          }
          else{                                                      // if mid>key then foud on left part hence update the end point....
            end=mid-1;

          }


       }
       return -1;                                                     // if no element match with mid then return -1 for no element found in array....
    }
    public static void main(String[] args) {            //binary search required sorted array
        int arr[]={11,22,33,44,55,66,77,88,99};
        int key=77;
        int result=binarysrch(arr,key);
        if(result==-1){
            System.out.println("elment not exist in array...");
        }
        else{
            System.out.println("element found on index:"+result);

        }
        
        
    }
}