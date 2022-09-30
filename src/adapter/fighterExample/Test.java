package adapter.fighterExample;

public class Test {
    public static void main(String[] args) {
        Fighter wizard = new WizardAdapter("타락파워마법사",200);
        wizard.attack();
        wizard.defend();
        wizard.goHome();

        System.out.println( " ======= ");
        Fighter warrior = new Warrior("zl존최강전사",23);
        warrior.attack();
        warrior.defend();
        warrior.goHome();
    }
}
