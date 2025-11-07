package com.programmer.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.programmer.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
