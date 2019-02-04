package com.ts.microservices.todowebflux.controller;

import com.ts.microservices.todowebflux.domain.ToDo;
import com.ts.microservices.todowebflux.inMemRepo.ToDoInMemRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

//@RestController
public class ToDoController {


    private ToDoInMemRepository repository;

    public ToDoController(ToDoInMemRepository repository){
        this.repository = repository;
    }

    @GetMapping("/todo/{id}")
    public Mono<ToDo> getToDo(@PathVariable String id){
        return this.repository.findById(id);
    }

    @GetMapping("/todo")
    public Flux<ToDo> getToDos(){
        return this.repository.findAll();
    }

}
