package com.desouza.client.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desouza.client.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
