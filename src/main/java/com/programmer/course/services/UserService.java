package com.programmer.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.programmer.course.entities.User;
import com.programmer.course.repositories.UserRepository;

@Service
public class UserService {

  @Autowired
  private UserRepository repository;

  public List<User> findAll() {
    return repository.findAll();
  }

  public User findById(Long id) {
    if(id == null){
      throw new IllegalArgumentException("ID cannot be null");
    }

    Optional<User> obj = repository.findById(id);
    return obj.get();
  }

  public User insert(User obj) throws Exception {
    if(obj.getEmail() == null || obj.getEmail().isEmpty()){
      throw new Exception("Email cannot be null or empty");
    }

    return repository.save(obj);
  }

  public void delete(Long id) {
    repository.deleteById(id);
  }
}
