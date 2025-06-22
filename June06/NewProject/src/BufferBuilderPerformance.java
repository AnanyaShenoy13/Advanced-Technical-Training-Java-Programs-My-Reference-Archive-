public class BufferBuilderPerformance {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        StringBuffer buffer= new StringBuffer("Ananya");
        for(int i=0;i<10000000;i++){
            buffer.append("Shenoy");
        }
        System.out.println("Buffer time: "+(System.currentTimeMillis()-startTime)+"ms");
        startTime = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder("Shenoy");
        for(int i=0;i<10000000;i++){
            builder.append("Shenoy");
        }
        System.out.println("Builder time: "+(System.currentTimeMillis()-startTime)+"ms");
    }
}
