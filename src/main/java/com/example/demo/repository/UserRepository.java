package com.example.demo.repository;

import com.example.demo.model.UserModel;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserModel, Long> {
    UserModel findByUsername(String username);
    boolean existsByUsername(String username);
}
