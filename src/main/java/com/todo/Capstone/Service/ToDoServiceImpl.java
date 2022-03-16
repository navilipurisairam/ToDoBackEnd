package com.todo.Capstone.Service;
import com.todo.Capstone.Dao.ToDoDAO;
import com.todo.Capstone.entity.ToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class ToDoServiceImpl implements ToDoService{
    private ToDoDAO toDoDAO;
    @Autowired
    public ToDoServiceImpl(ToDoDAO theToDoDAO){toDoDAO= theToDoDAO;}
    @Transactional
    public List<ToDo> findAll(){ return toDoDAO.findAll();}

}
