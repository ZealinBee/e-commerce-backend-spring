package com.example.ecommercespringbootlearn.product;

public class Product {
    private int productId;
    private String title;
    private int price;
    private String description;
    private String image;

    public Product() {
    }

    public Product(String title, int price, String description, String image) {
        this.title = title;
        this.price = price;
        this.description = description;
        this.image = image;
    }

    public Product(int productId, String title, int price, String description, String image) {
        this.productId = productId;
        this.title = title;
        this.price = price;
        this.description = description;
        this.image = image;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
