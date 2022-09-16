package abstractFactory.domain.userInfo.dao;

import abstractFactory.domain.userInfo.UserInfo;

public interface UserInfoDao {
    void inserUserInfo(UserInfo u);
    void updateUserInfo(UserInfo u);
    void deleteUserInfo(UserInfo u);
}
