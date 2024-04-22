
package javaapplication14;

public class BookProduct extends Product {
protected  String author;
 protected String publisher;

    public BookProduct() {
    }

 public BookProduct(int productid, String name, float price, String author, String publisher) {
        super(productid, name, price);
        this.author = author;
        this.publisher = publisher;
    }
 
 
    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
