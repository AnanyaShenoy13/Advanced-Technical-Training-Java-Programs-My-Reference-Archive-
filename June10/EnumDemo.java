enum BugPriority{
    HIGH,
    LOW,
    MEDIUM
}
public class EnumDemo {
    public static void main(String[] args) {
        BugPriority priority=BugPriority.HIGH;
        System.out.println(priority);
        for(BugPriority p:BugPriority.values()){
            System.out.print(p+" ");
        }
        System.out.println();
    }
}
