package peaksoft.service;

import peaksoft.entity.Like;

import java.util.List;

public interface LikeService {
    List<Like> findAll();
    void save(Like like);
    Like findById(Long Id);
    void deleteById(Long Id);
    void updateById(Long Id,Like newEntity);
}
