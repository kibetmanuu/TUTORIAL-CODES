/**
 * input
 */
import java.util.Scanner;
public class input {

    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
              System.out.println(" enter yourmarks");

       int marks =sc.nextInt();/*for string int scanned=sc.next(); for boolean\\ boolean scanned =sc.nextBoolean();*/
        System.out.println(marks);
       if (marks>=50) {
        System.out.println("pass");
    
       } 
       else if (marks==0) {
        System.out.println("RETAKE");
        
       }
       else if (marks>=20) {
        System.out.println("FAIR");
       }
       else {
        System.out.println("fail");
        
       }
    }
} 