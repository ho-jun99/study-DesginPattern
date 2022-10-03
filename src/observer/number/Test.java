package observer.number;

public class Test {
    public static void main(String[] args) {

        Observer bob = new GraphObserver("BOB");
        Observer jack = new GraphObserver("JACK");
        Observer tom = new GraphObserver("TOM");
        NumberGenerator random = new RandomGenerator();

        random.addObserver(bob);
        random.addObserver(jack);
        random.addObserver(tom);
        random.execute(3);

//        random.setNumber(5);
//        random.setNumber(10);




    }
}
