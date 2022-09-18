package templateMethod;

public class AdvancedLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("상급자 달리기!! 빠름");
    }

    @Override
    public void jump() {
        System.out.println("상급자 점프!! 높음");
    }

    @Override
    public void atack() {
        System.out.println("상급자 공격!! 공격력 10");
    }

    @Override
    public void showLevel() {
        System.out.println("======@AdvancedLevel@======");
    }
}
