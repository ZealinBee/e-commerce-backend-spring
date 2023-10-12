package com.example.ecommercespringbootlearn.product;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CompletableFuture;
@Service
public class ProductService implements IProductService{
    private final IProductRepository productRepository;

    public ProductService(IProductRepository productRepository) {
        this.productRepository = productRepository;
    }



    public List<Product> getAll() {
            return productRepository.findAll();
        }


    public Product createOne(Product product) {
        return productRepository.save(product);
    }



}
