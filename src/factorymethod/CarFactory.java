package factorymethod;

// Creator
public abstract class CarFactory {

    public abstract Car createCar(String name);
    public abstract Car reCallCar(String name);

    // 아래 기능들은 CarFactory안에서 구현해도 상관 없다.
    public abstract void washCar();
    public abstract void numbering();
    public abstract void lightOn();
    public abstract void lightOff();

    // 템플릿 메서드에 해당됨. 순서를 미리 정해줌
    final public void beforeSellCar(String name){
        System.out.println("@@@@===자동차 생산 및 테스트===@@@@");
        createCar(name);
        washCar();
        numbering();
        lightOn();
        lightOff();
        System.out.println("@@@@===자동차를 출고합니다!!===@@@@");
    }
}
