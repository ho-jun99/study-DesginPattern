package abstractFactory.domain.userInfo.dao.oracle;

import abstractFactory.domain.userInfo.UserInfo;
import abstractFactory.domain.userInfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao {
    @Override
    public void inserUserInfo(UserInfo u) {
        System.out.println("Insert Into Oracle DB, UserId : "+ u.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo u) {
        System.out.println("update Into Oracle DB, UserId : "+ u.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo u) {
        System.out.println("delete from Oracle DB, UserId : "+ u.getUserId());
    }
}
