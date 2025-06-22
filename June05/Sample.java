class Stringstack{
    private static final int MAX_SIZE=5;
    private String[] arr=new String[MAX_SIZE];
    private int top=-1;
    public void push(String data){
        if(top==MAX_SIZE-1){
            System.out.println("Stack overflow. Cannot push "+data);
            return;
        }
        arr[++top]=data;
        System.out.println("Pushed "+data);
    }
    public String pop(){
        if(top==-1){
            return null;
        }
        String popped=arr[top--];;
        System.out.println("Popped "+popped);
        return popped;
    }
    public String peek(){
        if(top==-1){
            System.out.println("Stack underflow. No top element");
            return null;
        }
        return arr[top];
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public boolean isFull(){
        return top==MAX_SIZE-1;
    }
    public int size(){
        return top+1;
    }
    public void printStack(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack elements:");
        for(int i=0;i<=top;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
public class Sample {
    public static void main(String[] args) {
        Stringstack stack=new Stringstack();
        stack.push("Apple");
        stack.push("Mango");
        stack.push("Avocado");
        stack.printStack();
        System.out.println("Top element: "+stack.peek());
        stack.pop();
        stack.printStack();

    }
}
