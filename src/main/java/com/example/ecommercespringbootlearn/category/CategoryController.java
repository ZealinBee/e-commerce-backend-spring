package com.example.ecommercespringbootlearn.category;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/category")
public class CategoryController {
    private final ICategoryService categoryService;

    public CategoryController(ICategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public List<GetCategoryDTO> getCategories() {
        return categoryService.getAll();
    }

    @PostMapping
    public GetCategoryDTO createCategory(@RequestBody CreateCategoryDTO dto) {
        return categoryService.createOne(dto);
    }

    @PatchMapping(path = "{categoryId}")
    public GetCategoryDTO updateCategory(@PathVariable("categoryId") int id, @RequestBody UpdateCategoryDTO dto) {
        return categoryService.updateOne(id, dto);
    }

    @DeleteMapping(path = "{categoryId}")
    public void deleteCategory(@PathVariable("categoryId") int id) {
        categoryService.deleteOne(id);
    }
}
