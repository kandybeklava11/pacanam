package peaksoft.service;

import peaksoft.entity.UserInfo;

import java.util.List;

public interface UserInfoService {
    List<UserInfo> findAll();
    void save(UserInfo userInfo);
    UserInfo findById(Long Id);
    void deleteById(Long Id);
    void updateById(Long Id,UserInfo newEntity);
}
