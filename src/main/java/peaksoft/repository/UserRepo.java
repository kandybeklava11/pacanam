package peaksoft.repository;

import peaksoft.entity.Comment;
import peaksoft.entity.User;

import java.util.List;

public interface UserRepo {
    List<User> findAll();
    void signIn(User user);
    void signUp(User user);
    User findById(Long Id);
    void deleteById(Long Id);
    void updateById(Long Id,User newEntity);
    User getUserByUsername(String username);
}
