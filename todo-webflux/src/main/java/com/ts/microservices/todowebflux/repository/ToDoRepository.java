package com.ts.microservices.todowebflux.repository;

import com.ts.microservices.todowebflux.domain.ToDo;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends ReactiveMongoRepository<ToDo,String> {
}
