package com.example.ecommercespringbootlearn.category;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ICategoryService {
    List<GetCategoryDTO> getAll();
    GetCategoryDTO createOne(CreateCategoryDTO dto);
    GetCategoryDTO updateOne(int id, UpdateCategoryDTO dto);
    void deleteOne(int id);
}
