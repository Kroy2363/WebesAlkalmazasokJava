package com.asszi.demo2.repository;

import org.springframework.data.repository.CrudRepository;

public interface PeopleRepository extends CrudRepository<People, Long> {
    
}
