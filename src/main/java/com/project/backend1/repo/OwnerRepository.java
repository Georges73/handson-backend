package com.project.backend1.repo;

import org.springframework.data.repository.CrudRepository;

import com.project.backend1.domain.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

}