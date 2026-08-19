import java.util.Scanner.*;
class variables{

     static String center= "kharghar";
     String name="chaitu";
     final int a=10;

    public static void main(String [] args){
       
        String course="ac";
        variables obj1=new variables();
       
        System.out.println("value of static  "+obj1.center);
        System.out.println("value of instance  "+obj1.name);     //calling all variables without change
        System.out.println("value of local  "+course);
        System.out.println("-------------------");

        course="bda";
        obj1.name="athu";
        obj1.center="pune";
        System.out.println(obj1.center);
         System.out.println(obj1.name);           // change all variables and print
          System.out.println(course);
          System.out.println("-------------------");

          variables obj2=new variables();
           System.out.println("value of static  "+obj2.center);
           System.out.println("value of static  "+obj2.name);  //print all variables with 2nd obj
           System.out.println("value of static  "+course);
           System.out.println("-------------------");

           System.out.println("static call with class name  "+variables.center);
           variables.center="banglore";                          // static varible change by class name
           System.out.println("change  "+variables.center);

           System.out.println("final variable  :"+obj1.a);
           //obj1.a=8;                                     // final variable cannot be change
           






    }
}