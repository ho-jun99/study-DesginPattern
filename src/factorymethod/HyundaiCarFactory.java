package factorymethod;

import java.util.HashMap;

// Concrete Creator
public class HyundaiCarFactory extends CarFactory{
    HashMap<String,Car> carMap = new HashMap<>();
    @Override
    public Car createCar(String name) {
        Car car = null;
        // 여기서 객체 인스턴스(차)를 만들어주는 행위
        if ( name.equals("sonata")) {
            car = new Sonata();
        } else if (name.equals("grandeur")) {
            car = new Grandeur();
        }
        return car;
    }

    @Override
    public Car reCallCar(String name) {
        Car car = carMap.get(name);

        // reCall할 차가 없는 경우 차를 새로 만들어 준다.
        if ( car == null) {
            if ( name.equals("hojun")){
                car = new Sonata();
            } else if (name.equals("tom")) {
                car = new Grandeur();
            }
            carMap.put(name,car);
        }
        return car;
    }

    @Override
    public void washCar() {
        System.out.println("현대 블루링크에서, 세차를 진행합니다.");
    }

    @Override
    public void numbering() {
        System.out.println("현대 블루링크에서, 자동차 번호를 부여합니다.");
    }

    @Override
    public void lightOn() {
        System.out.println("현대 블루링크에서, 상향등 테스트를 시작합니다.");
    }

    @Override
    public void lightOff() {
        System.out.println("현대 블루링크에서, 상향등 테스트를 종료합니다.");
    }
}
