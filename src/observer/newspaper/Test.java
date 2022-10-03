package observer.newspaper;

import observer.newspaper.observer.Observer;
import observer.newspaper.observer.User;

public class Test {
    public static void main(String[] args) {
        Company kbs = new BroadCastCompany("KBS");

        Observer hojun = new User("HoJun");
        Observer bob = new User("Bob");
        Observer tom = new User("Tom");
        Observer sam = new User("Sam");
        Observer martin = new User("R.martin");

        kbs.addUser(hojun);
        kbs.addUser(bob);
        kbs.addUser(tom);
        kbs.addUser(sam);
        kbs.addUser(martin);

        kbs.publishItem("[기상예보] 내일 많은비가 예상됩니다.");

    }
}


