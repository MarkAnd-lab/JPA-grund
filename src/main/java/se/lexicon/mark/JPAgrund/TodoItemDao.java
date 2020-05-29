package se.lexicon.mark.JPAgrund;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

public class TodoItemDao {
    @PersistenceContext
    private EntityManager entityManager;

    public TodoItemDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional
    public TodoItem findById(int id){
        return entityManager.find(TodoItem.class, id);
    }

    @Transactional
    public TodoItem merge(TodoItem todoItem){
        return entityManager.merge(todoItem);
    }

    @Transactional
    public TodoItem persist(TodoItem todoItem) throws IllegalAccessException  {
        if(todoItem== null) {throw new IllegalArgumentException("Can't persist AppUser appUser= "+ todoItem);
        }entityManager.persist(todoItem);
        return todoItem;
    }

    @Transactional
    boolean delete(TodoItem todoItem){
        return true;
    }
}
