import java.util.Arrays;

public class sort {
    public static void main(String[] args) {
        int[] ages={89,87,98,56,12,6,7,98,78};
        Arrays.sort(ages,1,5);
        for( int x:ages)
        {
            System.out.print(x+ ": ");
        }
       
    }
}
