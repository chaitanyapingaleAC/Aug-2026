import java.util.*;
public class maxsubarray {

    public static void subarray(int arr[]){
         int maxsum=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){             //definr start 
            int start=i;
            for(int j=i;j<arr.length;j++){     //definr end 
                int end=j;
                int currentsum=0;
                for(int k=start;k<=end;k++){       //add each element of subarray in currentsum
                    currentsum +=arr[k];

                }
                System.out.println("sum:"+currentsum);
                
                if(maxsum<currentsum){              //compare currentsum and maximun sum for get max value subarray...
                    maxsum=currentsum;
                }
            }      
          }
          System.out.println("maximum sum is"+maxsum);
    }

    public static void main(String[] args) {
        int arr[]={2,3,4,2,34,55,3};
        subarray(arr);

    }

}