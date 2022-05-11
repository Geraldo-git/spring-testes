package com.example.sbtestes.model.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.sbtestes.model.entities.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer>{

}
