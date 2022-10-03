package observer.number;

import java.util.Random;

public class RandomGenerator extends NumberGenerator{
    private Random random = new Random();
    private int number;

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void setNumber(int n) {
        number = n;
        notifyObservers();
    }

    @Override
    public void execute(int n) {
        for (int i=0; i<n; i++){
            number = random.nextInt(100);
            notifyObservers();
        }
    }
}
