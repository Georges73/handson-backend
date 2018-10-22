package com.project.backend1.repo;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.project.backend1.domain.User;



@Repository

public interface UserRepository extends CrudRepository<User, Long> { 

    User findByUsername(String username);

}