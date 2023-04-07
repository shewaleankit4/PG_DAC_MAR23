



import java.util.Scanner;

class Q{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //a
        //valueOf() is Static func of String Class
        boolean b1 = sc.nextBoolean(); 
        String S1 = String.valueOf(b1);
        System.out.println("\nString Value is "+S1);

        System.out.println("enter String to conver into boolean");

        //b
        //
        System.out.println("enter boolean to conver into Boolean instance");

        boolean b3 = sc.nextBoolean();
        Boolean B = new Boolean(b3);

        System.out.println(B);

        //c
        //it takes value true if input is true irrespective of case and any other will be treated as false
        String S2 = sc.next();
        boolean b2 =Boolean.valueOf(S2);

        System.out.println("\nBoolean Value is "+b2);

        //d

        System.out.println("enter String to conver into Boolean instance");
        String S3 = sc.next();
        Boolean B1 = new Boolean(S3);

        System.out.println(B1);

    

        sc.close();


    }
}
