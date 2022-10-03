package observer.number;

import java.util.ArrayList;

public abstract class NumberGenerator {
    ArrayList<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(){
        observers.forEach(observer -> observer.update(this));
    }

    public abstract int getNumber();
    public abstract void execute(int n);
    public abstract void setNumber(int n);

}
