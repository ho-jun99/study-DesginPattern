package abstractFactory.domain.product.dao.oracle;

import abstractFactory.domain.product.Product;
import abstractFactory.domain.product.dao.ProductDao;

public class ProductOracleDao implements ProductDao {
    @Override
    public void insertProduct(Product p) {
        System.out.println("Insert Into Oracle DB, productId : "+ p.getProductId());
    }

    @Override
    public void updateProduct(Product p) {
        System.out.println("update Into Oracle DB, productId : "+ p.getProductId());

    }

    @Override
    public void deleteProduct(Product p) {
        System.out.println("delete from Oracle DB, productId : "+ p.getProductId());

    }
}
