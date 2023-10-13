package com.example.ecommercespringbootlearn.product;

public record ProductDTO() {
}

record CreateProductDTO(String title, int price, String description, String image, int categoryId) {
    @Override
    public String title() {
        return title;
    }

    @Override
    public int price() {
        return price;
    }

    @Override
    public String description() {
        return description;
    }

    @Override
    public String image() {
        return image;
    }

    @Override
    public int categoryId() {
        return categoryId;
    }
}

