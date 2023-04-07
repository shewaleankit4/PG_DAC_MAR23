import java.util.Scanner;

public class ElectricityBill {
    String customerName;
    int unitsConsumed;
    double billAmount;

    Scanner sc = new Scanner(System.in);

    ElectricityBill(){
        System.out.println("Enter Name :");
        this.customerName = sc.nextLine();
        System.out.println("Enter units Consumed :");
        this.unitsConsumed = sc.nextInt();
        this.billAmount=0;
    }

    public double Bill(){
        int temp = unitsConsumed;
         if(temp<100){
            this.billAmount = this.billAmount + (temp*5);
            return this.billAmount;
        }
        else{
            this.billAmount = this.billAmount + (100*5);
            if(temp<300){
                temp = temp -100;
                this.billAmount = this.billAmount + (temp*7); 
                return this.billAmount;
            }
            else if(temp>300){
                this.billAmount = this.billAmount + (200*7);
                temp = temp -300;
                this.billAmount = this.billAmount + (temp*10);
            }
            else{
                    temp = temp - 100;
                    this.billAmount = this.billAmount + (temp*7);
            }

        }
        

        return this.billAmount;

    }


    public static void main(String[] args) {
        
        ElectricityBill E = new ElectricityBill();

        System.out.println("Amount of Bill customer must pay is :"+E.Bill()+"rS.");

    }
    
}
