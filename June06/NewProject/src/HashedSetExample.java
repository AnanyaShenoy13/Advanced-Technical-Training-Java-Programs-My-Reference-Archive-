import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashedSetExample {
    public static void main(String[] args) {
        HashSet<String> names=new LinkedHashSet<>();
        names.add("Ananya");
        names.add("Navya");
        names.add("Amisha");
        names.add("Afra");
        HashSet<Integer> numbers=new LinkedHashSet<>();
        numbers.add(1);
        numbers.add(12);
        numbers.add(13);
        numbers.add(1);
        numbers.add(1);
        numbers.add(16);
        System.out.println(names.contains("Shenoy"));
        System.out.println(numbers);
        names.clear(); //to clear the set
        System.out.println(names.isEmpty()); //to check if the set is empty
    }
}
