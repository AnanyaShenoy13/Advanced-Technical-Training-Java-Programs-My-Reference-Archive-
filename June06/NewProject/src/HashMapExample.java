import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, String> hm1=new HashMap<>();
        hm1.put("01","xxxx");
        hm1.put("06","aaaa");
        hm1.put("03","bbbb");
        hm1.put("09","cccc");
        hm1.put("05","dddd");
        System.out.println("Iterating over the hashmap: ");
        for(Map.Entry<String,String> entry:hm1.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue()+" "+entry.getClass());
        }

        // LinkedHashMap is usd to maintain the insertion order
        HashMap<String, String> hm2=new LinkedHashMap<>();
        hm2.put("01","xxxx");
        hm2.put("06","aaaa");
        hm2.put("03","bbbb");
        hm2.put("09","cccc");
        hm2.put("05","dddd");
        System.out.println("Iterating over the  Linked hashmap: ");
        for(Map.Entry<String,String> entry:hm2.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue()+" "+entry.getClass());
        }
    }
}
