//Write a Java program to remove items from a collection using the Iterator interface based on certain given conditions
//Remove items using Iterator

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(12);
        numbers.add(2);
        numbers.add(9);
        numbers.add(13);
        numbers.add(11);
        numbers.add(4);
        numbers.add(5);
//        Iterator<Integer> it=numbers.iterator();
//        while(it.hasNext()){
//            Integer i=it.next();
//            if(i>10){
//                it.remove();
//            }
//        }

        numbers.removeIf(i->i>10);
        System.out.println("Lst after removal of numbers>10: "+numbers);



    }



}
