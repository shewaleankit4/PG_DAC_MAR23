import java.util.Scanner;

public class Book {
    String title;
    String author;
    String publisher;
    String isbn;
    int year;
    double price;
    int quantity;

    static double invtPrice = 0;

    static Scanner sc = new Scanner(System.in);
    public Book(){
        System.out.println("Enter Title");
        this.setTitle(sc.nextLine());
        System.out.println("Enter Author");
        this.setAuthor(sc.nextLine());
        System.out.println("Enter Publisher");
        this.setPublisher(sc.nextLine());
        System.out.println("Enter ISbn");
        this.setIsbn(sc.nextLine());
        System.out.println("Enter Quantity");
        this.setQuantity(sc.nextInt());
        System.out.println("Enter Year");
        this.setYear(sc.nextInt());
        System.out.println("Enter Price");
        this.setPrice(sc.nextDouble());
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setPrice(double price) {
        this.price = price;
        Book.invtPrice = Book.invtPrice + (this.price*this.quantity);
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setYear(int year) {
        this.year = year;
    }
    
    public int increaseQuantity(int quant ){
        this.quantity = this.quantity + quant;
        Book.invtPrice = Book.invtPrice + (this.price*quant);
        return this.quantity;
    }

    public int decreaseQuantity(int quant ){
        this.quantity = this.quantity - quant;
        Book.invtPrice = Book.invtPrice - (this.price*quant);
        return this.quantity;
    }

    public static void main(String[] args) {

        System.out.println("Initial Inventory Price is :"+Book.invtPrice);

        Book B = new Book();
        System.out.println("Inventory Price is after Book1 :"+Book.invtPrice);

        System.out.println("do you want to increase or dex=crease quantity ");
        String c =sc.next();
        if(c.equalsIgnoreCase("YES")){
            int count = sc.nextInt();
            switch(count){
                case 1:
                        int d =sc.nextInt();
                        B.increaseQuantity(d);
                        break;
                case 2:
                        int e =sc.nextInt();
                        B.decreaseQuantity(e);
                        break;

            }

        }
        System.out.println("Inventory Price is :"+Book.invtPrice);
       

        /*Book B1 = new Book();
        
        System.out.println("Inventory Price is :"+Book.invtPrice);

        B.increaseQuantity(20);*/

        
        
       
    }
}
