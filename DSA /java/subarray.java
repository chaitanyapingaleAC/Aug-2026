import java.util.*;
class subarray{

    public static void subarry(int arr[]){
        int ts=0;
        for(int i=0;i<arr.length;i++){
            int start=i;                //for initilize start node
            for(int j=i;j<arr.length;j++){
                int end=j;             //for initilize end node
                for(int k=start;k<=end;k++){
                                                           //for print tht subarray
                   System.out.print(arr[k]+" ");
                 
                }
                  ts++;
                System.out.println("");
            }
            System.out.println("");
            
        }   
        System.out.println("total numbers of subarray:"+ts);
        
    }
    
      public static void main(String[] args) {
        
        int arr[]={1,3,45,6,8,6,7};
        subarry(arr);

        
      }

}