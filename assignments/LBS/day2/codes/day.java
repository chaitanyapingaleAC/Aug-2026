import java.util.*;

public class day {
  public static void main(String [] args){
    System.out.println("enter number ");
    Scanner sc = new Scanner(System.in);
    int a=sc.nextInt();
    switch(a){
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
  }  
}
