
package javaapplication14;


public class ElectronicProduct extends Product {
  protected  String brand;
  protected  int warrantyPeriod;

    public ElectronicProduct() {
    }

    public ElectronicProduct(int productid, String name, float price, String brand, int warrantyPeriod) {
        super(productid,name, price);
        this.brand = brand;
        this.warrantyPeriod = Math.abs(warrantyPeriod);}

   
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = Math.abs(warrantyPeriod);
    }
    
    
    public String getBrand() {
        return brand;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

   
 
    
    
    
    
    
    
    
    
    
    
}
