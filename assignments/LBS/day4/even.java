public class even {
    void evennumber(){
        int i=1;
           while(i<=50){
            System.out.print((i%2==0)? i :" ");
            i++;
           }

    }

    public static void main(String []args){
        even obj1=new even();
        obj1.evennumber();
    }
}
