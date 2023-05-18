import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class slide85 {
    public static void main(String[] args) throws Exception {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("CSDL", "Co so du lieu");
        // System.out.println(hashMap);

        Set<Map.Entry<String, String>> setHashMap = hashMap.entrySet();
        System.out.println("Cac entry co trong setHashMap : ");
        System.out.println(setHashMap);

        
    }
}
