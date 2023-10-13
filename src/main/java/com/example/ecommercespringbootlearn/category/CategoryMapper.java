package com.example.ecommercespringbootlearn.category;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public class CategoryMapper {
    GetCategoryDTO categoryToGetDTO(Category category) {
        return new GetCategoryDTO(
                category.getCategoryId(),
                category.getName(),
                category.getImage(),
                category.getProducts()
        );
    }

    Category createDTOToCategory(CreateCategoryDTO dto) {
        return new Category(
                dto.name(),
                dto.image()
        );
    }
}
