package com.example.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.app.models.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Integer>{

}
