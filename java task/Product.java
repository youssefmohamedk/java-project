
package javaapplication14;

public class Product {
protected  int productid;
protected  String name;
protected  float price;

    public Product() {
    }


public Product(int productId, String name, float price) {
        this.productid = Math.abs(productId);
        this.name = name;
       this.price =Math.abs( price);}

    public void setProductid(int productid) {
        this.productid = Math.abs(productid);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price =Math.abs(price);
    }

    
    public int getProductid() {
        return productid;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }
    
    
    
    
    
    
    
    
    
}
