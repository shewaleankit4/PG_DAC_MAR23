import java.util.Scanner;

class Q8{

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
 //  byte value into String
        byte b =sc.nextByte();
        String S = String.valueOf(b);
        System.out.println("String value of  byte "+S);

// byte value into Byte instance.
        byte b1 =sc.nextByte();
        Byte B = new Byte(b1);
        System.out.println("Byte instance value  "+B);
        
        /*String S1 = "a";
        Byte B1 = new Byte(S1);

        System.out.println("String Instance to Byte Instance "+B1);*/
        
        sc.close();

    }
}