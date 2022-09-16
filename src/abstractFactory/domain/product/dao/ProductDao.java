package abstractFactory.domain.product.dao;

import abstractFactory.domain.product.Product;

public interface ProductDao {
    void insertProduct(Product p);
    void updateProduct(Product p);
    void deleteProduct(Product p);
}
