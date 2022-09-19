package factorymethod;

// Product 해당 부
public abstract class Car {
    public String carType;

    @Override
    public String toString() {
        return carType;
    }
}
