import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.LinkedHashMap;

public class maps {
    public static void main(String[] args) {
        Map m =new LinkedHashMap();
        m.put("009", 001);
        m.put("ma", 002);
        m.put("man", 003);
        m.put("anu", 004);
        m.remove("man", 003);
        m.containsKey("ma");
        System.out.println(m.containsKey("anu"));
        System.out.println(m);
        System.out.println(m.containsValue(004));
      }
}
