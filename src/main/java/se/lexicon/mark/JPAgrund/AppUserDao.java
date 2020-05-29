package se.lexicon.mark.JPAgrund;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
public class AppUserDao {

    @PersistenceContext
    private EntityManager entityManager;

    public AppUserDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional
    public AppUser findById(int id) {
        return entityManager.find(AppUser.class, id);
    }

    @Transactional
    public AppUser merge(AppUser appUser) {
        return entityManager.merge(appUser);
    }

    @Transactional
    public AppUser persist(AppUser appUser) throws IllegalAccessException {
        if (appUser == null) {
            throw new IllegalArgumentException("Can't persist AppUser appUser= " + appUser);
        }
        entityManager.persist(appUser);
        return appUser;
    }

    @Transactional
    boolean delete(AppUser appuser) {
        return true;
    }

}
