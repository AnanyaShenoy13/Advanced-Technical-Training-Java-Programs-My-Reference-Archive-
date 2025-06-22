class Demo {
    int x;

    {
        System.out.println("Instance initializer");
        x = 100;
    }

    Demo() {
        System.out.println("Default constructor: x = " + x);
    }

    Demo(int val) {
        System.out.println("Param constructor: x = " + x + ", val = " + val);
    }

    public static void main(String[] args) {
        new Demo();
        new Demo(42);
    }
}
