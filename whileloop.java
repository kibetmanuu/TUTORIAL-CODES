import java.util.Scanner;
public class whileloop {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       System.out.print("TYPE YOUR AGE");
         int years=sc.nextInt();
       int count=0; 
       do{
            System.out.print("ENTER ANOTHER AGE");
         years=sc.nextInt();
        count++;
        }while (years!=50);
        System.out.println("you tried " + count + " times");
    }
}
