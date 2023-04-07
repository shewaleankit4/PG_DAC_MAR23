import java.util.Scanner;

class BMI{

    double h;
    double w;

    BMI(){
        this.h = 0;
        this.w = 0;

    }

    public void setH(double h) {
        this.h = h;
    }

    public void setW(double w) {
        this.w = w;
    }

    Double calculateBMI(){
        return (this.w/Math.pow(this.h, 2));

    }
    public static void main(String[] args) {
           BMI A = new BMI();  
           Scanner sc = new Scanner(System.in);
           A.setH(sc.nextDouble());
           A.setW(sc.nextDouble());

           System.out.printf("your BMI is %.3f",A.calculateBMI());

           sc.close();
    
    }
}