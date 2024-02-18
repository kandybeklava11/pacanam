package peaksoft.service;

import peaksoft.entity.Follower;

import java.util.List;

public interface FollowerService {
    List<Follower> findAll();
    void save(Follower follower);
    Follower findById(Long Id);
    void deleteById(Long Id);
    void updateById(Long Id,Follower newEntity);
}
