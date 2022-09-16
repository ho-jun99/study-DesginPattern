package abstractFactory.factory;

import abstractFactory.domain.product.dao.ProductDao;
import abstractFactory.domain.product.dao.oracle.ProductOracleDao;
import abstractFactory.domain.userInfo.dao.UserInfoDao;
import abstractFactory.domain.userInfo.dao.oracle.UserInfoOracleDao;

public class OracleDaoFactory implements DaoFactory{
    @Override
    public ProductDao createProductDao() {
        return new ProductOracleDao();
    }

    @Override
    public UserInfoDao createUserInfoDao() {
        return new UserInfoOracleDao();
    }
}
