package mediator;

import java.util.ArrayList;

public abstract class Mediator {
    ArrayList<Colleague> list;

    Mediator(){
        list = new ArrayList<Colleague>();
    }

    public void addUser(Colleague user){
        list.add(user);
    }

    public abstract void mediate(Colleague user, String msg);
}
