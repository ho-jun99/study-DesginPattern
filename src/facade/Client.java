package facade;

import Test.A;

public class Client {
    public static void main(String[] args) {

        // 퍼사드 패턴을 사용하지 않는 경우
        Buns buns = new Buns();
        Patty patty = new Patty();
        Vegetable vegetable = new Vegetable();
        buns.burn();
        patty.ready();
        patty.grill();
        vegetable.wash();
        vegetable.hand();
        Assemble hambuger = new Assemble(buns,patty,vegetable);
        hambuger.complete();

        System.out.println("");
        System.out.println("@@@@@@@Facade 패턴을 이용합니다.@@@@@@@");
        // Facade 이용
        Facade hambugerMaker = new Facade();
        hambugerMaker.makeHambuger();

    }
}
