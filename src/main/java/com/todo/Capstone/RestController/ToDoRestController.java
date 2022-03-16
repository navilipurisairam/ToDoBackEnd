package com.todo.Capstone.RestController;
import com.todo.Capstone.entity.ToDo;
import com.todo.Capstone.Service.ToDoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api")
@CrossOrigin
public class ToDoRestController {
    private ToDoService toDoService;
    @Autowired
    public ToDoRestController(ToDoService theToDoService){
        toDoService=theToDoService;
    }
    @GetMapping("/todos")
    public List<ToDo> findAll(){
        return toDoService.findAll();
    }

}
