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
	public void get(){
		System.out.print("this.re ,this.im ");
	
	}
	
	Complex1(Complex1 c)
    {
 
        System.out.println("Copy constructor called");
 
        re = c.re;
        im = c.im;
    }
	
	@Override public String toString()
    {
 
        return "(" + re + " + " + im + ")";
    }
	
    // Main driver method
    public static void main(String[] args)
    {
 
        // Creating object of above class
        // inside main() method
        Complex1 c1 = new Complex1(10, 15);
		
		Complex1 c2 = new Complex1(c1);
 
        // Note: compiler error here
        //Complex1 c2 = new Complex1(c1);
		System.out.println(c2);
    }
}
 
// Class 2
// Main class
