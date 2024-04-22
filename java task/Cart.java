
package javaapplication14;

public class Cart {
 private int customerId;
private int numberproduct;
private product[] products;



    public Cart() {
    } 
    
public Cart(int customerId, int numberProduct) {
    this.customerId = Math.abs(customerId);
    this.numberproduct = Math.abs(numberproduct);
    this.products = new Product[numberProduct];}

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getNumberproduct() {
        return numberproduct;
    }

    public void setNumberproduct(int numberproduct) {
        this.numberproduct = numberproduct;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
public float calculateprice(){
float totalprice =0;
for (int i=0;i<products.length;i++){
totalprice +=products[i].getPrice();}
     return totalprice;
}
public void addproduct(Product product){
for (int i=0;i<products.length;i++){
if (products[i]==null){
products[i]=product;
this.numberproduct++;
break;
}}




}
public void removeproduct(Product product){
for (int i=0;i<products.length;i++){
if (products[i]==product){
products[i]=null;
this.numberproduct--;
break;}


}}
 //public void placeOrder(int a){
 //Order order=new Order(customerId,,products,calculateprice());
 //switch(a){
   //  case 1:
     //    System.out.println("your order’s summary");
       //  order.printorderinfo();
         //break;
     //case 2:System.out.println("buy soon");
     //default:System.out.println("erorr");
     //break;
       public void placeOrder(){
        System.out.println("Your ID : "+customerId);
        System.out.println("Total Price : "+Cart.this.calculateprice());
        for (int i =0 ;i<products.length;i++) {
            System.out.println(products[i].getName() + " - $" + products[i].getPrice());
        }  
 
    }
}

 
 
 
 
 
 
 
 
 
 
 
 
 




 







    
    
    
    
    
    
    
    
    
    
    
    

