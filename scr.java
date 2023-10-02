
import java.util.Scanner;
public class scr {
    public static void main(String[] args) {
        System.out.print("enter your grretings");
        Scanner sc=new Scanner(System.in);
        String c =sc.next();
      
        System.out.println(c);
        if (c.equals("hello"))
         {
            System.out.println("hello too");
        } 
        else {
            System.out.println("super");
            
        }
        
    }
}
