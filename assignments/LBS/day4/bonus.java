import java.util.Scanner;

public class bonus {


    
        static byte aa;
        static short bb;
        static  int c;
        static long d;
        static float e;
        static double f;
        static char g;
        static boolean h;


      
        void boonus(){




             int choice;
         do{
       
          Scanner sc=new Scanner(System.in);
   
          System.out.println("--------------------");

          System.out.println("1.Grade Evaluation System:");
          System.out.println("2:Leap Year Check");
          System.out.println("3:Days of week");
          System.out.println("4:Identify Default Values Of variables");
          System.out.println("5.Exit");
          System.out.println("--------------------");


          System.out.println("Enter your choice number");

            choice=sc.nextInt();

           switch(choice){


            case 1: 

             System.out.println("------you choose grade evaluation system------");

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

     
            System.out.println(".............DONE..........");
            break;


            case 2:

            System.out.println("------you choose leap year check-------");

            System.out.println("enter the year");
             int a= sc.nextInt();

             if(a%4==0 && a%100!=0 || a%400==0){
                System.out.println(a+" is leap year...");
             }
             else
                System.out.println(a+" is not leaap year...");



            System.out.println("............DONE..........");
            break;


            case 3:

            System.out.println("--------you choose day of weeks------");

            System.out.println("enter number ");

                int b=sc.nextInt();
             switch(b){
               case 1:
                   System.out.println("the day is monday...");
                break; 
               case 2:
                   System.out.println("the day is Tuesday... ");
                break;
               case 3:
                   System.out.println("the day is wednesday...");
                 break;
                 case 4:
                   System.out.println("the day is thrusday...");
                break;
                case 5:
                System.out.println("the day is friday...");
                break;
                case 6:
                 System.out.println("the day is saturday...");
                 break;
                 case 7:
                  System.out.println("the day is sunday...");
                  break;
                 default:
                  System.out.println("invalid day number...");
                 break;    



                }

            System.out.println("..........DONE..........");

            break;

            case 4:

            System.out.println("------you choose default values of variable------");
           

   
                System.out.println("bytes  :  "+aa);
                System.out.println("short  :  "+bb);
                System.out.println("int  :  "+c);
                System.out.println("long  :  "+d);
                System.out.println("float  :  "+e);
                System.out.println("double  :  "+f);
                System.out.println("char  :  "+g);
                System.out.println("boolean  :  "+h);


            System.out.println("........DONE..........");

            break;

            case 5:
               System.out.println("Thank you...");
               System.out.println(".........DONE..........");

            break;

            default:
                System.out.println("XXXXXXXXX enter the valid number XXXXXXXXXXXX");
           }



        }    

        while(choice!=5);

        }





    public static void main(String[] args) {

        bonus obj5=new bonus();
        obj5.boonus();

       

    }
}
