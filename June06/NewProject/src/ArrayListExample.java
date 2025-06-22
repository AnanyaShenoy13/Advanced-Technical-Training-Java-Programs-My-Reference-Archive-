//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.ArrayList;

public class ArrayListExample{
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(13);
        numbers.add(10);
        System.out.println(numbers);
        System.out.println(numbers.get(2));

        ArrayList<String> names=new ArrayList<>();
        names.add("Java");
        names.add("Java");
        names.add("Java");
        names.add("Java");
        System.out.println(names);

        @Deprecated
        ArrayList data=new ArrayList();
        data.add("1");
        data.add("c");
        data.add(true);
        System.out.println(data);

    }
}