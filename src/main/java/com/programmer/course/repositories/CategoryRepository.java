package com.programmer.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.programmer.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
