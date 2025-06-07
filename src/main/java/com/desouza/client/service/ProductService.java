package com.desouza.client.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desouza.client.dto.CategoryDTO;
import com.desouza.client.dto.ProductDTO;
import com.desouza.client.entity.Category;
import com.desouza.client.entity.Product;
import com.desouza.client.repository.CategoryRepository;
import com.desouza.client.repository.ProductRepository;

import jakarta.transaction.Transactional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Transactional
    public ProductDTO insert(ProductDTO dto) {
        Product entity = new Product();
        entity.setName(dto.getName());
        entity.setPrice(dto.getPrice());

        for (CategoryDTO catDto : dto.getCategories()) {
            Category cat = categoryRepository.getReferenceById(catDto.getId());
            entity.getCategories().add(cat);
        }

        entity = productRepository.save(entity);
        return new ProductDTO(entity);
    }

}
