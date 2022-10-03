package observer.newspaper.observer;

import observer.newspaper.Company;

public class User implements Observer{
    String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(Company company) {
        System.out.println("===================");
        System.out.println(name+"님 새로운 알림이 도착했습니다.");
        System.out.println(company.getMsg());
        System.out.println("===================");
        System.out.println();
    }
}
