package decorator.coffee;

import decorator.coffee.decorator.Latte;
import decorator.coffee.decorator.MochaCoffee;

public class Test {
    public static void main(String[] args) {
        // Coffee etiopiaCoffee = new EtiopiaCoffee();

        Coffee keyaCoffee = new KeyaCoffee();
        keyaCoffee.brewing();
        System.out.println();

        Coffee keyaLatte = new Latte(keyaCoffee);
        keyaLatte.brewing();
        System.out.println();

        Coffee keyaLatteMocha = new MochaCoffee(keyaLatte);
        keyaLatteMocha.brewing();
        System.out.println();

        Coffee keyaMochaLatte = new Latte(new MochaCoffee(new KeyaCoffee()));
        keyaMochaLatte.brewing();
    }
}
