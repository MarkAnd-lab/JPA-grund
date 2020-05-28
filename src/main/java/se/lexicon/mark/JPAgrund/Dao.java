package se.lexicon.mark.JPAgrund;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
public class Dao {

    @PersistenceContext
    private EntityManager entityManager;

    public Dao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Transactional
    public AppUser findById(int id){
       return entityManager.find(AppUser.class, id);
    }

    @Transactional
    public AppUser merge(AppUser appUser){
        return entityManager.merge(appUser);
    }

    @Transactional
    public AppUser save(AppUser appUser){
        return entityManager.merge(appUser);
}
    @Transactional
    boolean delete(AppUser appuser){
        return true;
    }

}
