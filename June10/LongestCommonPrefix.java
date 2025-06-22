import java.util.Arrays;

class TrieNode {
    TrieNode[] children=new TrieNode[26];
    boolean isEndofWord;
    int childrenCount;
    TrieNode(){
        isEndofWord=false;
        childrenCount=0;
//        for(int i=0;i<26;i++){
//            children[i]=null;
//        }
        // above for loop can be written using the built-in function
        Arrays.fill(children,null);
    }
}
public class LongestCommonPrefix {
    public static void insert(TrieNode root, String str) {
        TrieNode cur=root;
        for(char c: str.toCharArray()) {
            int index=c-'a';
            if(cur.children[index]==null) {
                cur.children[index]=new TrieNode();
                cur.childrenCount++;
            }
            cur=cur.children[index];
        }
        cur.isEndofWord=true;
    }
    public static String longestCommonPrefix(TrieNode root) {
        // code = c+o+d+e -> StringBuilder
        StringBuilder prefix=new StringBuilder();
        TrieNode current=root;
        while(current!=null && current.childrenCount==1 && !current.isEndofWord) {
            for(int i=0;i<26;i++){
                if(current.children[i]!=null) {
                    prefix.append((char)(i+'a'));
                    current=current.children[i];
                    break;
                }
            }
        }
        return prefix.toString();
    }
    public static void main(String[] args) {
        TrieNode root=new TrieNode();
        String[] words={"flower","flow","flight","flight","flight","flight"};
        for(String word:words) {
            insert(root,word);
        }
        String lcp=longestCommonPrefix(root); //fl
        if(lcp.isEmpty()){
            System.out.println("There is no common prefix among the input words.");
        }
        else{
            System.out.println("The longest common prefix is: "+lcp);
        }
    }

}
