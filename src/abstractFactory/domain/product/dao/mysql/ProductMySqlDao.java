package abstractFactory.domain.product.dao.mysql;

import abstractFactory.domain.product.Product;
import abstractFactory.domain.product.dao.ProductDao;

public class ProductMySqlDao implements ProductDao {
    @Override
    public void insertProduct(Product p) {
        System.out.println("Insert Into MySQL DB, productId : "+ p.getProductId());
    }

    @Override
    public void updateProduct(Product p) {
        System.out.println("update Into MySQL DB, productId : "+ p.getProductId());

    }

    @Override
    public void deleteProduct(Product p) {
        System.out.println("delete from MySQL DB, productId : "+ p.getProductId());

    }
}
