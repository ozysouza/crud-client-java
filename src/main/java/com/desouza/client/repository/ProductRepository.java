package com.desouza.client.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desouza.client.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
