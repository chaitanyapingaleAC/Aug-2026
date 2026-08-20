import java.util.Scanner;
public class age {
    void agecalculator(int a){
           int ag=a;
           String result=(ag>=60)? "senior citizen":(ag>18 && ag<60)?"adult":"minor";
           System.out.println("you are an "+result);
    }

    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        age obj1=new age();
        System.out.println("enter your age");
        int a=sc.nextInt();
        obj1.agecalculator(a);

    }
}
