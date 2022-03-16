package com.todo.Capstone.Dao;
import org.hibernate.Session;
import org.hibernate.query.Query;
import com.todo.Capstone.entity.ToDo;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;
@Repository
public class ToDoDAOHibernateImpl implements ToDoDAO{
    private EntityManager entityManager;
    public ToDoDAOHibernateImpl(EntityManager theEntityManager){ entityManager=theEntityManager;}
    public List<ToDo> findAll(){
        Session currentSession=entityManager.unwrap(Session.class);
        Query<ToDo> TheQuery=currentSession.createQuery("from ToDo ",ToDo.class);
        List<ToDo> toDos =TheQuery.getResultList();
        return toDos;
    }
}
