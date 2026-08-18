import java.util.*;
class grade{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks of Subject maths,science,history respectively....");
        float math=sc.nextFloat();
        float science=sc.nextFloat();
        float history=sc.nextFloat();
        float total=(math+science+history);
        float average=(math+science+history)/3;
        System.out.println("average marks:"+average);
        if(average>=90){
            System.out.println("Grade:A");
        }
        else if(average>=70 && average<90 ){
            System.out.println("Grade:B");
        }
        else if(average>=50 && average<70){
            System.out.println("Grade:C");
        }
        else if(average>=30 && average<50){
            System.out.println("Grade:D");
        }
        else System.out.println("Fail");
    }
}