

package javaapplication14;
    import java.util.Scanner;
public class JavaApplication14 {
    

    public static void main(String[] args) {
  Scanner input=new Scanner(System.in);

        System.out.println("Welcome to the Ecommerce system2132 !");
        ElectronicProduct e1 = new ElectronicProduct( 1,  "Smart Phone", 599.99f,"Samsung", 1);
        ClothingProduct c1 = new ClothingProduct(2, "T-Shirt",19.99f, "mediam","cotton");
        BookProduct b1 = new BookProduct( 3,"OOP",39.99f,"O’Reilly", "X Publications");
        System.out.print("Please Enter your ID : ");
        int id = input.nextInt();
        System.out.print("Please Enter your Name : ");
        String name =input.next();
        System.out.print("Please Enter your address : ");
        String address =input.next();
        Customer C = new Customer(id, name, address);
        System.out.println("How many products you want to add to your cart ? ");
        int n = input.nextInt();
        Cart j = new Cart(id, n);
        j.setNumberproduct(n);
        for (int i = 0; i < n; i++) {
            System.out.println("Which Product you want to add yo your Cart ? \n 1.Smart Phone \n 2.T-Shirt \n 3.OOP");
        
            int c = input.nextInt();
            switch (c) {
                case 1:
                   j.addproduct(new ElectronicProduct(1,"smart phone ",1233.99f,"apple",1));
                    break;
                case 2:
                   j.addproduct(new ClothingProduct(2,"t shirt ",19.99f,"medium","cotton"));
                    break;
                case 3:
                  j.addproduct(new BookProduct(3,"OOP",39.99f,"O’Reilly", "X Publications"));
                    break;
                default:
                    System.out.println("wrong choice");
                    i--;
                    break;
            }
        }
  
          System.out.println("Your Total Salary : " + j.calculateprice() + ". Would you like to place the order \n 1.Yes \n 2.No ");
        int x = input.nextInt();
        Order o1 = new Order();
        if (x == 1) {
            System.out.println("Here's your order's summary : ");
//            o1.printOrderInfo();
        j.placeOrder();
        } else {
            System.out.println("We cancelled all your Orders ");
        }
        System.out.println("We hope we could help you Thanks.");
}

}
  
  
  
  
  
  
  
  
  
  
  
    
    

