import java.io.*;

class main8{
    public static void main(String[] a){
        try{
            int x=10/0;
        }catch(Exception e){
            System.out.println("unchecked exception");
        }

        try{
            FileReader f=new FileReader("abc.txt");
        }catch(Exception e){
            System.out.println("checked exception");
        }
    }
}