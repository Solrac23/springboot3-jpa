package com.programmer.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.programmer.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
