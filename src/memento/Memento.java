package memento;

import java.util.ArrayList;

public class Memento {
    private int money;
    private ArrayList<String> fruits;

    Memento(int money){
        this.money = money;
        fruits = new ArrayList<String>();
    }

    int getMoney(){
        return money;
    }

    void addFruit(String fruit) {
        fruits.add(fruit);
    }

    ArrayList<String> getFruits() {
        return (ArrayList<String>) fruits.clone();
    }

}
