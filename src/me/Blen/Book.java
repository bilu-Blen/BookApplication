package me.Blen;

public class Book {
    private String title;
    private String author;
    private String description;
    private double price;
    private double inStock;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }




    public Book() {
        title="Unqualified";
        author="Steven";

    }

    public Book(String title, String author){
        this.title=title;
        this.author=author;
    }

    public String getDispplayText(){
        return author + title + description;

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getInStock() {
        return inStock;
    }

    public void setInStock(double inStock) {
        this.inStock = inStock;
    }
}
