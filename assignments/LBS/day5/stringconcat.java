public class stringconcat {
    public static void main(String []args){
        String str1="hello";
        String str2="world";
        String str3=str1+str2;
        System.out.println("is str3 is pointing to same object as str1 ? "+(str3==str1));
    }
}
