package observer.newspaper;

import observer.newspaper.observer.Observer;

import java.util.ArrayList;

public abstract class Company {
    ArrayList<Observer> observers = new ArrayList<>();

    public void addUser(Observer observer){
        observers.add(observer);
    }

    public void removeUser(Observer observer){
        observers.remove(observer);
    }

    public void notifyAllUser(){
        observers.forEach(observer -> observer.update(this));
    }

    public abstract void publishItem(String msg);
    public abstract String getMsg();
}
