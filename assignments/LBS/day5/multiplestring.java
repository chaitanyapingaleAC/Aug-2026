public class multiplestring {
    public static void main(String []args){
        String str1="hello";
        String str2="hello";
        String str3="hello";

        System.out.println("all string point to same object ? : "+(str1==str2 && str2==str3));
    }
}
