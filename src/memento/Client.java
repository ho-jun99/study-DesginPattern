package memento;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        // 첫 소지금은 100이다.
        Gamer gamer = new Gamer(100);
        // 첫번째 상태를 저장한다.
        Memento memento = gamer.createMemento();

        ArrayList<Memento> careTaker = new ArrayList<Memento>();
        // 초기 상태를 careTaker에 등록해놓습니다.
        careTaker.add(memento);

        for (int i = 0; i < 10; i++) {
            System.out.println("==== " + i);
            System.out.println("현재 상태:" + gamer);

            // 게임을 진행한다.
            gamer.bet();
            System.out.println("소지금은 " + gamer.getMoney() + "원이 되었습니다.");

            if( gamer.getMoney() < memento.getMoney() /2 ){
                System.out.println("      ( 파산을 막기위해 이전 상태로 복구합니다. )     ");
                gamer.restoreMemento(memento);
            }else if ( gamer.getMoney() >= memento.getMoney()){
                System.out.println("      ( 돈이 많아서 현재 상태를 SAVE 합니다. )      ");
                memento = gamer.createMemento();
                careTaker.add(memento);
            }


            // 천천히 플레이 될 수 있도록
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
            System.out.println("");
        }

        System.out.println();
        System.out.println("memento 상황 조회");
        for( Memento m : careTaker) {
            System.out.println(m.getMoney());
        }
    }
}
