public class BufferExample {
    public void stringAppend(){
        StringBuffer buffer=new StringBuffer("Core");
        System.out.println("Original String: "+buffer);
        buffer.append("Java");
        System.out.println("New String: "+buffer);
    }
    public void stringInsert(){
        StringBuffer buffer=new StringBuffer("JA");
        System.out.println("Original String: "+buffer);
        buffer.insert(1,"VA");
        System.out.println("New String: "+buffer);
    }
    public void stringReverse(){
        StringBuffer buffer=new StringBuffer("BNMIT");
        System.out.println("Original String: "+buffer);
        buffer.reverse();
        System.out.println("New String: "+buffer);
    }

    public static void main(String[] args) {
        new BufferExample().stringAppend(); // another way of creating object
        new BufferExample().stringInsert();
        new BufferExample().stringReverse();

    }

}
