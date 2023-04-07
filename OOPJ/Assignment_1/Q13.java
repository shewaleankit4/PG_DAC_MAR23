public class Q13 {
   
    
    public static void main(String[] args) {
        String S ="123";
        Short S1 = new Short(S);

        System.out.println("Short instance into byte "+S1.byteValue());
        System.out.println("Short instance into int "+S1.intValue());
        System.out.println("Short instance into float  "+S1.floatValue());
        System.out.println("Short instance into double"+S1.doubleValue());
        System.out.println("Short instance into long "+S1.longValue());
    }
}
