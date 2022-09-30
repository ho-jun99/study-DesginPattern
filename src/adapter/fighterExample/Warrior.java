package adapter.fighterExample;

public class Warrior implements Fighter{
    private String name;
    private int level;

    Warrior(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public void showInfo() {
        System.out.print("[ LEVEL "+ level + ", USERNAME " + name +"]");
    }

    @Override
    public void attack() {
        showInfo();
        System.out.println( "Warrior 공격!");
    }

    @Override
    public void defend() {
        showInfo();
        System.out.println("Warrior 방어");
    }

    @Override
    public void goHome() {
        showInfo();
        System.out.println("Warrior 걸어서 귀환");
    }
}
