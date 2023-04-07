import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter byte value");
        byte b1 = sc.nextByte();
        Byte B = new Byte(b1);

        System.out.println("Byte instance to byte value "+B.byteValue());
        System.out.println("Byte instance to short value "+B.shortValue());
        System.out.println("Byte instance to int value "+B.intValue());
        System.out.println("Byte instance to float value "+B.floatValue());
        System.out.println("Byte instance to double value "+B.doubleValue());

    }
}
