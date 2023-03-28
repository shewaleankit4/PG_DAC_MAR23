class Complex {
 
    // Class data members
    private int re, im;
 
    // Constructor
    public Complex(int re, int im)
    {
        // this keyword refers to current instance itself
        this.re = re;
        this.im = im;
    }
}
 
// Class 2
// Main class
public class GFG1 {
 
    // Main driver method
    public static void main(String[] args)
    {
 
        // Creating object of above class
        // inside main() method
        Complex c1 = new Complex(10, 15);
 
        // Note: compiler error here
        Complex c2 = new Complex(c1);
    }
}