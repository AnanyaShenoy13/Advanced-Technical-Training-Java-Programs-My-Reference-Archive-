import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String[] duplicateData={"Java","Python","SQL","Java","C++","Java",} ;
        Set<String> uniqueData=new LinkedHashSet<>();
        for(String str: duplicateData){
            uniqueData.add(str);
        }
        System.out.println(uniqueData);

        //Using Lambda Expression

        uniqueData.forEach(x-> System.out.print(x+" "));
    }
}
