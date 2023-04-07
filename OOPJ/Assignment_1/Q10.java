import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    //The number of bits used to represent a char value
    System.out.println("no. of bits used to represent Byte "+Character.SIZE);
    
    //The number of bytes used to represent a char value
    System.out.println("no. of bytes used to represent Byte "+Character.BYTES);
    //The minimum value a char
    System.out.println("Max value of Char "+Character.MAX_VALUE);   
     //The maximum value a char
     System.out.println("Max value of Char "+Character.MIN_VALUE);
    // implicit casting of max value to int
     System.out.println("Max minus 1 value of Char "+(Character.MAX_VALUE-1));  

     sc.close();
    }
}
