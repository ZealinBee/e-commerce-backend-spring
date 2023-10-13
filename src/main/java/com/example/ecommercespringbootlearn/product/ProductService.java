package com.example.ecommercespringbootlearn.product;

import com.example.ecommercespringbootlearn.category.Category;
import com.example.ecommercespringbootlearn.category.ICategoryRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CompletableFuture;
@Service
public class ProductService implements IProductService{
    private final IProductRepository productRepository;
    private final ICategoryRepository categoryRepository;


    public ProductService(IProductRepository productRepository, ICategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    public List<Product> getAll() {
            return productRepository.findAll();
        }


    public Product createOne(CreateProductDTO dto) {
        Category foundCategory = categoryRepository.findById(dto.categoryId())
                .orElseThrow(() -> new EntityNotFoundException("Category not found"));
        Product product = new Product();
        product.setTitle(dto.title());
        product.setPrice(dto.price());
        product.setDescription(dto.description());
        product.setImage(dto.image());
        product.setCategory(foundCategory);
        return productRepository.save(product);
    }



}
