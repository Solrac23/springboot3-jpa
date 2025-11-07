package com.programmer.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.programmer.course.entities.Product;
import com.programmer.course.repositories.ProductRepository;

@Service
public class ProductService {

  @Autowired
  private ProductRepository repository;

  public List<Product> findAll() {
    return repository.findAll();
  }

  public Product findById(Long id) {

    if(id == null){
      throw new IllegalArgumentException("ID cannot be null");
    }

    Optional<Product> obj = repository.findById(id);
    return obj.get();
  }
}
