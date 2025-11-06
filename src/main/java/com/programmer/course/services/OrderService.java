package com.programmer.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.programmer.course.entities.Order;
import com.programmer.course.repositories.OrderRepository;

@Service
public class OrderService {

  @Autowired
  private OrderRepository repository;

  public List<Order> findAll() {
    return repository.findAll();
  }

  public Order findById(Long id) {

    if(id == null){
      throw new IllegalArgumentException("ID cannot be null");
    }

    Optional<Order> obj = repository.findById(id);
    return obj.get();
  }
}
