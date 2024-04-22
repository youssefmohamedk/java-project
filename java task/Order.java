
package javaapplication14;


public class Order {
private int customerId;
private int orderid;
  private Product products [];
    private float totalPrice ;

    public Order() {
    }
    
    
    
    
  public Order(int customerId, int orderId, Product[] products, float totalPrice) {
        this.customerId = customerId;
        this.orderid = orderId;
        this.products = products;
        this.totalPrice = totalPrice;
    }
public void printOrderInfo(){
    System.out.println("Customer ID : "+customerId);
    System.out.println("Order ID : "+orderid);
    System.out.println("Products : ");
//    for (Product x : products ){
//        System.out.println(x.getName()+" - "+x.price);
//        }
    System.out.println("Total Price : "+totalPrice);
}







}






    
}
