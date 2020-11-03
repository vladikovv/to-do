package com.vladikov.todoapp.services;

import com.vladikov.todoapp.exceptions.EntityNotFoundException;
import com.vladikov.todoapp.data.ToDo;
import com.vladikov.todoapp.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoService {

    private ToDoRepository repository;

    @Autowired
    public ToDoService(ToDoRepository repository) {
        this.repository = repository;
    }

    public List<ToDo> findAll() {
        return repository.findAll();
    }

    public ToDo findById(String id) {
        return repository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public ToDo save(ToDo toDo) {
        return repository.save(toDo);
    }

    public void deleteById(String id) {
        repository.deleteById(id);
    }


}
