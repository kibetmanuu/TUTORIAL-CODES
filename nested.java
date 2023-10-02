
import java.util.Scanner;
public class nested {
    public static void main(String[] args) {
        System.out.println("ENTER YOUR AGE");
        Scanner sc =new Scanner(System.in);
        int age=sc.nextInt(); 
        System.out.print(age);
       /* int AGE=Integer.parseInt(age);*/
        if (age<=30){
    System.out.println("you are a youth");

}
else{
System.out.println("\nENTER YOUR DOB");
String Age=sc.next();
int DOB=Integer.parseInt(Age);
System.out.println(DOB);
if (DOB>2000) {
   System.out.println("KIBAKI"); 
} else {
    System.out.println("MOI");
    
}

double sub=2023-DOB;
System.out.println("your age is\n"+sub);
}
    }
}
