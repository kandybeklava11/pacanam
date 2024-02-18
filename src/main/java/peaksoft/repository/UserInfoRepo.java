package peaksoft.repository;

import peaksoft.entity.UserInfo;

import java.util.List;

public interface UserInfoRepo {
    List<UserInfo> findAll();
    void save(UserInfo userInfo);
    UserInfo findById(Long Id);
    void deleteById(Long Id);
    void updateById(Long Id,UserInfo newEntity);
}
