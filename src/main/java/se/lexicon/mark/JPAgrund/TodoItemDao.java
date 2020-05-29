package se.lexicon.mark.JPAgrund;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

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
    @Transactional
    public List<TodoItem> findByTitle(String title) throws IllegalArgumentException {
        if(title == null) {
            throw new IllegalArgumentException("String title = " +  title);
        }
        Query query = entityManager.createQuery("SELECT s FROM TodoItem s WHERE s. title = ? 1 ");
        query.setParameter(1, title);
        return query.getResultList();
    }

    @Transactional
    public List<TodoItem> findAll() {
        Query query = entityManager.createQuery("SELECT s FROM TodoItem s");
        return query.getResultList();
    }

    @Transactional
    public List<TodoItem> findByDone() {
        Query query = entityManager.createQuery("SELECT s FROM TodoItem s");
        return query.getResultList();
    }

}
