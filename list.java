import java.util.ArrayList;
public class list {
    public static void main(String[] args) {
        ArrayList<String> t=new ArrayList<String>();/*types */
        t.add("kibet");
        t.add("kipkoech");
        t.add("brayo");
        t.add("chebet");
        t.add("ian");
        t.add("kiptoo");
        t.set(3, "harry");
        t.get(0);
        System.out.println(t);
        System.out.println(t.get(0));
        t.subList(0, 3);
        System.out.println(t.subList(0, 3));
    }
}
