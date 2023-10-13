package com.example.ecommercespringbootlearn.category;

import com.example.ecommercespringbootlearn.product.Product;
import jakarta.persistence.OneToMany;

import java.util.List;

public record CategoryDTO() {
}

record GetCategoryDTO(int categoryId,String name,String image,List<Product> products) {

}

record UpdateCategoryDTO(String name, String image) {
    @Override
    public String name() {
        return name;
    }

    @Override
    public String image() {
        return image;
    }
}

record CreateCategoryDTO(String name, String image) {
    @Override
    public String name() {
        return name;
    }

    @Override
    public String image() {
        return image;
    }
}