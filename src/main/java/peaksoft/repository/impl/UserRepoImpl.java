package peaksoft.repository.impl;

import jakarta.persistence.EntityManager;

import jakarta.persistence.NoResultException;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import peaksoft.entity.User;
import peaksoft.repository.UserRepo;

import java.util.List;

@Repository
@Transactional
@RequiredArgsConstructor
public class UserRepoImpl implements UserRepo {
    @PersistenceContext
    private final EntityManager entityManager;

    @Override
    public List<User> findAll() {
        return entityManager.createQuery(
                "select u from User u", User.class).getResultList();
    }

    @Override
    public void signIn(User user) {
        User foundUser =getUserByUsername(user.getUserName());

        if (foundUser != null && foundUser.getPassword().equals(user.getPassword())) {

            System.out.println("User signed in successfully: " + foundUser);
        } else {

            System.out.println("Incorrect username or password");
        }
    }


    @Override
    public void signUp(User user) {
        entityManager.persist(user);
    }

    @Override
    public User findById(Long Id) {
        return entityManager.find(User.class, Id);
    }

    @Override
    public void deleteById(Long Id) {
        entityManager.remove(entityManager.find(User.class, Id));
    }

    @Override
    public void updateById(Long Id, User newEntity) {
        User user = entityManager.find(User.class, Id);
        user.setUserName(newEntity.getUserName());
        user.setEmail(newEntity.getEmail());
        user.setPhoneNumber(newEntity.getPhoneNumber());
        user.setImage(newEntity.getImage());
    }

    @Override
    public User getUserByUsername(String username) {
        try {
            return entityManager.createQuery("SELECT u FROM User u WHERE u.userName = :username", User.class)
                    .setParameter("username", username)
                    .getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }
    }

