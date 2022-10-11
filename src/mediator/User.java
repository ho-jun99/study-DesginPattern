package mediator;

public class User implements Colleague{
    String name;
    Mediator mediator;

    User(String name, Mediator mediator){
        this.name = name;
        this.mediator = mediator;
    }

    @Override
    public void recived(String msg) {
        System.out.println(name + "님에게 메시지 도착 - " + msg);
    }

    @Override
    public void send(String msg) {
        System.out.println("@@@@" + name + "-> ALL : " + msg+ "@@@@@");
        mediator.mediate(this,msg);
    }
}
