import java.util.Scanner;
public class askpositive {
     static int a;

    void ispositive(){
       

        do{
            System.out.println("enter positive number");
            Scanner sc=new Scanner(System.in);
             a=sc.nextInt();
           
        }while(a<1);
           System.out.println("you enter positive number "+a);
        
    }

    public static void main(String []args){
        askpositive obj1=new askpositive();
        obj1.ispositive();

    }
    
}
