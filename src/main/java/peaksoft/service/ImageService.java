package peaksoft.service;

import peaksoft.entity.Image;

import java.util.List;

public interface ImageService {
    List<Image> findAll();
    void save(Image image);
    Image findById(Long Id);
    void deleteById(Long Id);
    void updateById(Long Id,Image newEntity);
}
