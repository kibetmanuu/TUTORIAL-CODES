/**
 * arrays
 */
import java.util.Scanner;
public class arrays {

    public static void main(String[] args) {
    
        int[] ages={34,65,78,23,76};
        int MYage =ages[4];
        System.out.println(MYage);
        String[] names={"kibet","manuu","chebet","enok"};

        String myname =names[0];
        System.out.println(myname);
        int[] salary={5000,7980,80000,8976,6000};
        int kibet=salary[1];
        System.out.println(kibet);
        if (kibet>5000) {
            System.out.println("premium");
        } else {
            System.out.println("normal");
            
        }
    }
}