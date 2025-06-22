import java.util.Arrays;
import java.util.List;

class Trienode {
    Trienode[] children;
    boolean wordEnd;
    Trienode(){
        wordEnd = false;
        children=new Trienode[26];
    }
}
public class Trie {
    //insert and search -> aryan
    static void insertWord(Trienode root, String word){
        Trienode curr=root;
        for(char c:word.toCharArray()){
            if(curr.children[c-'a']==null){
                // null means node is not present
                // So, we create a node of that character
                curr.children[c-'a']=new Trienode();
            }
            // Move to he children node for the next character
            curr=curr.children[c-'a'];
        }
        curr.wordEnd=true;
        //We have stored the word
    }
    static boolean searchWord(Trienode root, String word){
        Trienode curr=root;
        for(char c: word.toCharArray()){
            if(curr.children[c-'a']==null){
                // Node is not present in trie, return false
                return false;
            }
            curr=curr.children[c-'a'];
        }
        return curr.wordEnd;
    }

    public static void main(String[] args) {
        Trienode root=new Trienode();
        List<String> inputWords= Arrays.asList("ananya","atul","bhavana","ratnakar");
        for(String word:inputWords){
            insertWord(root,word);
        }
        List<String> searchWords= Arrays.asList("ananya","atul","bhavana","ratnakar","shenoy");
        for(String word:searchWords){
            if(searchWord(root,word)){
                System.out.println(word+" is present in the trie.");
            }
            else {
                System.out.println(word+" is not present in the trie.");
            }
        }
    }
}