package com.programmer.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.programmer.course.entities.Category;
import com.programmer.course.repositories.CategoryRepository;

@Service
public class CategoryService {

  @Autowired
  private CategoryRepository repository;

  public List<Category> findAll() {
    return repository.findAll();
  }

  public Category findById(Long id) {

    if(id == null){
      throw new IllegalArgumentException("ID cannot be null");
    }

    Optional<Category> obj = repository.findById(id);
    return obj.get();
  }
}
