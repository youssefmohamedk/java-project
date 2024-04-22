
package javaapplication14;

public class ClothingProduct extends Product {
 protected  String size;
 protected String fabric;

    public ClothingProduct() {
    }
 
 
 
   public ClothingProduct(int productid, String name, float price, String size, String fabric) {
        super(productid, name, price);
        this.size = size;
        this.fabric = fabric;
    }


    public void setSize(String size) {
        this.size = size;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    public String getSize() {
        return size;
    }

    public String getFabric() {
        return fabric;
    }
    
    
    
    
    
    
    
    
}
