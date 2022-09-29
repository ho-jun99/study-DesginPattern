package composite;

import composite.Category;
import composite.Product;
import composite.component.ProductCategory;

public class Test {
    public static void main(String[] args) {

        ProductCategory Vehicle = new Category(0,"Vehicle-Category",0);

        ProductCategory CarCategory = new Category(1,"Car-Category",0);
        ProductCategory MotorBikeCategory = new Category(2,"MotorBike-Category",0);

        // 탈것에 자동차와 오토바이 카테고리를 추가함
        Vehicle.addProduct(CarCategory);
        Vehicle.addProduct(MotorBikeCategory);

        ProductCategory Ferrari = new Product(100,"Ferrari488",1000);
        ProductCategory Porsche = new Product(200,"Porsche918-Boxter",1000);
        ProductCategory Sonata = new Product(300,"Sonata-Trubo",300);

        CarCategory.addProduct(Ferrari);
        CarCategory.addProduct(Porsche);
        CarCategory.addProduct(Sonata);


        ProductCategory SuperCurve = new Product(10,"SuperCurve", 10);
        ProductCategory R6 = new Product(20,"R6", 100);

        MotorBikeCategory.addProduct(SuperCurve);
        MotorBikeCategory.addProduct(R6);

        System.out.println("Vehicle에 속한 총 항목의 갯수 :  " + Vehicle.getCount() + ", 총 가격 " + Vehicle.getPrice());
        System.out.println("CarCategory에 속한 총 항목의 갯수 :  " + CarCategory.getCount() + ", 총 가격 " + CarCategory.getPrice());
        System.out.println("MotorBikeCategory 속한 총 항목의 갯수 :  " + MotorBikeCategory.getCount() + ", 총 가격 " + MotorBikeCategory.getPrice());


        // 삭제
        MotorBikeCategory.removeProduct(SuperCurve);
        System.out.println("MotorBikeCategory 속한 총 항목의 갯수 :  " + MotorBikeCategory.getCount() + ", 총 가격 " + MotorBikeCategory.getPrice());
        System.out.println("Vehicle에 속한 총 항목의 갯수 :  " + Vehicle.getCount() + ", 총 가격 " + Vehicle.getPrice());
    }
}
