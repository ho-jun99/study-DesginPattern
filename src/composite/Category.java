package composite;

import composite.component.ProductCategory;

import java.util.ArrayList;

public class Category extends ProductCategory {
    ArrayList<ProductCategory> list;

    public Category(int id, String name, int price) {
        super(id, name, price);
        list = new ArrayList<ProductCategory>();
    }

    @Override
    public void addProduct(ProductCategory product) {
        list.add(product);
    }

    @Override
    public void removeProduct(ProductCategory product) {
        for (ProductCategory item : list) {
            if (item.getId() == product.id) {
                System.out.println(product.getName() + "을 삭제합니다");
                list.remove(product);
                return;
            }
        }
        System.out.println("일치하는 카테고리가 없어 삭제할 수 없습니다.");
    }

    @Override
    public int getCount() {
        int totalCount = 0;
        for (ProductCategory item : list) {
            totalCount += item.getCount();
        }
        return totalCount;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        int totalPrice = 0;
        for (ProductCategory item : list) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    @Override
    public int getId() {return id;}
}
