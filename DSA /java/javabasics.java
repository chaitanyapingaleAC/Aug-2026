import java.util.*;
public class javabasics{
    public static void main(String args[]){
         int ch =1;
       for(int line=1;line<=5;line++){
        for(int star=5;star>=line;star--){
           
            System.out.print(ch);
            ch++;
        }
        System.out.println(" ");
       }
    }
     
}    