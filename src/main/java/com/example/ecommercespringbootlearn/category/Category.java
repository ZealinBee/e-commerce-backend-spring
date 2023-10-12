package com.example.ecommercespringbootlearn.category;

public class Category {
    private int categoryId;
    private String name;
    private String image;

    public Category() {
    }

    public Category(int categoryId, String name, String image) {
        this.categoryId = categoryId;
        this.name = name;
        this.image = image;
    }

    public Category(String name, String image) {
        this.name = name;
        this.image = image;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
