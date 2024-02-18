package peaksoft.service;

import peaksoft.entity.Comment;

import java.util.List;

public interface CommentService {
    List<Comment> findAll();
    void save(Comment comment);
    Comment findById(Long Id);
    void deleteById(Long Id);
    void updateById(Long Id,Comment newEntity);
}
