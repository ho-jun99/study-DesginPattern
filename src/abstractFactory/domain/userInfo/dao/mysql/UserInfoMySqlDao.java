package abstractFactory.domain.userInfo.dao.mysql;

import abstractFactory.domain.userInfo.UserInfo;
import abstractFactory.domain.userInfo.dao.UserInfoDao;

public class UserInfoMySqlDao implements UserInfoDao {
    @Override
    public void inserUserInfo(UserInfo u) {
        System.out.println("Insert Into MySQL DB, UserId : "+ u.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo u) {
        System.out.println("update Into MySQL DB, UserId : "+ u.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo u) {
        System.out.println("delete from MySQL DB, UserId : "+ u.getUserId());
    }
}
