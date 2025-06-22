public class BuilderExample {
    public void stringAppend(){
        StringBuilder buffer=new StringBuilder("Core");
        System.out.println("Original String: "+buffer);
        buffer.append("Java");
        System.out.println("New String: "+buffer);
    }
    public void stringInsert(){
        StringBuilder buffer=new StringBuilder("JA");
        System.out.println("Original String: "+buffer);
        buffer.insert(2,"VA");
        System.out.println("New String: "+buffer);
    }
    public void stringReverse(){
        StringBuilder buffer=new StringBuilder("BNMIT");
        System.out.println("Original String: "+buffer);
        buffer.reverse();
        System.out.println("New String: "+buffer);
    }

    public static void main(String[] args) {
        new BuilderExample().stringAppend(); // another way of creating object
        new BuilderExample().stringInsert();
        new BuilderExample().stringReverse();

    }

}
