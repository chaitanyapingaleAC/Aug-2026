import java.util.Scanner;
public class vowels {
    public static void main(String []args){
        System.out.println("enter the string");
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
             if( ch=='a'|| ch== 'e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
             }
        }
        System.out.println("th vowels in "+s+" is "+count);
    }
}
