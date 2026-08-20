
import java.util.Scanner;
public class multliplication {
    void multtable(int a){
    int x=a;
  
    for(int i=1;i<=10;i++){
        System.out.println(a+"*"+i+"="+a*i);
    }
    }
    public static void main(String[] args) {
        multliplication obj1=new multliplication();
        System.out.println("enter number");
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();

        obj1.multtable(a);

    }
}
