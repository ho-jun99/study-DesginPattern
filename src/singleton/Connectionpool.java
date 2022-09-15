package singleton;


/*

 */
public class Connectionpool {
    private static Connectionpool connectionpool = new Connectionpool();
    private Connectionpool(){}

    public static Connectionpool getInstance() {
        if ( connectionpool == null) {
            connectionpool = new Connectionpool();
        }
        return connectionpool;
    }

}
