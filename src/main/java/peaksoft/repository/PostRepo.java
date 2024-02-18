package peaksoft.repository;

import peaksoft.entity.Comment;
import peaksoft.entity.Like;
import peaksoft.entity.Post;

import java.util.List;

public interface PostRepo {
    List<Post> findAll();
    void save(Post like);
    Post findById(Long Id);
    void deleteById(Long Id);
    void updateById(Long Id,Post newEntity);
}
