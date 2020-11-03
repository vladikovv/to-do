package com.vladikov.todoapp.repositories;

import com.vladikov.todoapp.data.ToDo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ToDoRepository extends MongoRepository<ToDo, String> {

}
