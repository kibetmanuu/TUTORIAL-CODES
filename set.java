import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.LinkedHashSet;
public class set {
    public static void main(String[] args) {
      /*  Scanner sc=new Scanner(System.in); 
       String names=sc.nextLine();*/
       Set <Integer> t= new LinkedHashSet<Integer>();/*types of sets; hashset,linkedhashset, */
       t.add(5);
       t.add(7);
       t.add(8);
       t.add(90);
       t.add(15);
       t.remove(5);
       t.size();
       t.add(34);
       boolean g=t.containsAll(t);
      System.out.println(g); 
      System.out.println(t.size());
      System.out.println(t);
      boolean x=t.contains(9015);
      System.out.println(x);
    }
}
