package peaksoft.service;

import peaksoft.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    void save(User user);
    User findById(Long Id);
    void deleteById(Long Id);
    void updateById(Long Id,User newEntity);
    void signIn(User user);
    void signUp(User user);
    User getUserByUsername(String username);
}
