public class ImmutableStrings {
    public static void main(String[] args) {

        String name="BNMIT";
        System.out.println(name.toLowerCase());
        System.out.println("Original: "+name);

        StringBuffer sb=new StringBuffer("Java");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

    }
}
