package decorator.coffee.decorator;

import decorator.coffee.Coffee;

public class Latte extends Decorator{
    public Latte(Coffee coffee) {
        super(coffee);
    }

    @Override
    public void brewing() {
        super.brewing();
        System.out.print(" +Adding Milk(Latte)");
    }
}
