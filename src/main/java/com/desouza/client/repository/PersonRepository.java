package com.desouza.client.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desouza.client.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
