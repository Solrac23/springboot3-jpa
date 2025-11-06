package com.programmer.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.programmer.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
