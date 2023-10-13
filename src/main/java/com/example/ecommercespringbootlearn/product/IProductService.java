package com.example.ecommercespringbootlearn.product;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CompletableFuture;
@Service
public interface IProductService {
    List<Product> getAll();
    Product createOne(CreateProductDTO dto);
}
