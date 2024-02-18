package peaksoft.service.impl;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import peaksoft.entity.User;
import peaksoft.repository.UserRepo;
import peaksoft.repository.impl.UserRepoImpl;
import peaksoft.service.UserService;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepo userRepo;

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public void save(User user) {
        userRepo.signUp(user);
    }

    @Override
    public User findById(Long Id) {
        return null;
    }

    @Override
    public void deleteById(Long Id) {

    }

    @Override
    public void updateById(Long Id, User newEntity) {

    }

    @Override
    public void signIn(User user) {
        userRepo.signIn(user);
    }

    @Override
    public void signUp(User user) {

    }

    @Override
    public User getUserByUsername(String username) {
        return userRepo.getUserByUsername(username);
    }
}
