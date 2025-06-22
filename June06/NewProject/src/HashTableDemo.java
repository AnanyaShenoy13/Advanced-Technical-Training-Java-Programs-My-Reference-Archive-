import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht=new Hashtable<>();
        ht.put(106,"Blue");
        ht.put(117,"Red");
        ht.put(128,"Green");
        ht.put(100,"Yellow");
        ht.put(99,"White");
        for(Map.Entry<Integer,String> entry:ht.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }


    }
}
