package abstractFactory.factory;

import abstractFactory.domain.product.dao.ProductDao;
import abstractFactory.domain.userInfo.dao.UserInfoDao;

public interface DaoFactory {
    ProductDao createProductDao();
    UserInfoDao createUserInfoDao();
}
