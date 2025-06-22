import java.util.ArrayList;
import java.util.List;

public class WildCardExample {
    public static void printlistelements(List<?> list){ // can accept any datatype
        for(Object obj: list){
            System.out.print(obj+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> integerList=new ArrayList<>();
        integerList.add(1);
        integerList.add(1);
        printlistelements(integerList);
        ArrayList<String> stringList=new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        printlistelements(stringList);

    }
}
