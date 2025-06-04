package com.desouza.client.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desouza.client.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
