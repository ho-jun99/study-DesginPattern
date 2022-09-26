package decorator.coffee.decorator;

import decorator.coffee.Coffee;

public class MochaCoffee extends Decorator{
    public MochaCoffee(Coffee coffee) {
        super(coffee);
    }

    @Override
    public void brewing() {
        super.brewing();
        System.out.print(" +Ading Mocha Syrup");
    }
}
