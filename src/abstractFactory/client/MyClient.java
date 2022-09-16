package abstractFactory.client;

import abstractFactory.domain.product.Product;
import abstractFactory.domain.product.dao.ProductDao;
import abstractFactory.domain.userInfo.UserInfo;
import abstractFactory.domain.userInfo.dao.UserInfoDao;
import abstractFactory.factory.DaoFactory;
import abstractFactory.factory.MySqlDaoFactory;
import abstractFactory.factory.OracleDaoFactory;

import java.util.Scanner;

public class MyClient {
    public static void main(String[] args) {
        String input;
        DaoFactory factory;

        Scanner scan = new Scanner(System.in);
        System.out.println("MySQL과 Oracle 중 선택해주세요. >> ");
        input = scan.nextLine();
        System.out.println("선택한 데이터베이스 : " + input);


        factory = null;
        if ( input.equals("MySQL")) {
            factory = new MySqlDaoFactory();
        } else if( input.equals("Oracle")) {
            factory = new OracleDaoFactory();
        } else {
            System.out.println("잘못된 입력입니다.");
            System.exit(0);
        }

        ProductDao productDao = factory.createProductDao();
        UserInfoDao userInfoDao = factory.createUserInfoDao();
        // 새로운 데이터 생성 후 삽입하기
        productDao.insertProduct(new Product("새우깡","000001"));
        userInfoDao.inserUserInfo(new UserInfo("김호준","test1234","pwd1234"));

    }
}
