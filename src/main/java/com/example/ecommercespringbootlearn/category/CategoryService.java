package com.example.ecommercespringbootlearn.category;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryService implements ICategoryService{
    private final ICategoryRepository categoryRepository;
    private final CategoryMapper mapper;

    public CategoryService(ICategoryRepository categoryRepository, CategoryMapper categoryMapper) {
        this.categoryRepository = categoryRepository;
        this.mapper = categoryMapper;
    }

    public List<GetCategoryDTO> getAll() {
        List<Category> categories = categoryRepository.findAll();
        List<GetCategoryDTO> dtos = categories.stream()
                .map(category -> mapper.categoryToGetDTO(category))
                .collect(Collectors.toList());

        return dtos;
    }

    public GetCategoryDTO createOne(CreateCategoryDTO dto) {
        Category createdCategory = categoryRepository.save(mapper.createDTOToCategory(dto));
        return mapper.categoryToGetDTO(createdCategory);
    }

    public GetCategoryDTO updateOne(int id, UpdateCategoryDTO dto) {
        Category foundCategory = categoryRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Category not found"));
        foundCategory.setName(dto.name());
        foundCategory.setImage(dto.image());
        return mapper.categoryToGetDTO(categoryRepository.save(foundCategory));
    }

    public void deleteOne(int id) {
        Category foundCategory = categoryRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Category not found"));
        categoryRepository.delete(foundCategory);
    }
}
