package com.desouza.client.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desouza.client.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
