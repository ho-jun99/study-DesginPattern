package mediator;

public class ChatApp extends Mediator{
    @Override
    public void mediate(Colleague user, String msg) {
        for( Colleague u : list){
            if ( u != user ) {
                u.recived(msg);
            }
        }
    }
}
