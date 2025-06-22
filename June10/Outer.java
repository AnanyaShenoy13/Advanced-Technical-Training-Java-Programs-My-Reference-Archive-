public class Outer {
    private int value=20;
    class Inner{
        void display(){
            System.out.println("The value is: "+value);
        }
    }

    public static void main(String[] args) {
        Outer outer=new Outer();
        System.out.println(outer.value);
        Outer.Inner in=outer.new Inner();
        in.display();

    }
}
