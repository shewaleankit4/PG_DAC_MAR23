class Complex1 {
 
    // Class data members
    private int re, im;
 
    // Constructor
    public Complex1(int re, int im)
    {
        // this keyword refers to current instance itself
        this.re = re;
        this.im = im;
    }
	
    // Main driver method
    public static void main(String[] args)
    {
 
        // Creating object of above class
        // inside main() method
        Complex1 c1 = new Complex(10, 15);
 
        // Note: compiler error here
        Complex1 c2 = new Complex(c1);
    }
}
 
// Class 2
// Main class
