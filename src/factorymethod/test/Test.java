package factorymethod.test;

import factorymethod.Car;
import factorymethod.CarFactory;
import factorymethod.HyundaiCarFactory;

public class Test {
    public static void main(String[] args) {
        CarFactory factory = new HyundaiCarFactory();
        Car myCar = factory.createCar("sonata");
        System.out.println(myCar.carType);

        Car fatherCar = factory.createCar("grandeur");
        System.out.println(fatherCar.carType);

        factory.beforeSellCar("sonata");

        // 자동차 ReCall
        Car hCar = factory.reCallCar("hojun");
        Car hCar2 = factory.reCallCar("hojun");

        System.out.println(hCar.carType);
        System.out.println(hCar2.carType);
        System.out.println(hCar == hCar2);

    }
}
