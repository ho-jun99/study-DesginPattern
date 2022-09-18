package templateMethod;

public class BeginnerLevel extends PlayerLevel{

    @Override
    public void run() {
        System.out.println("초급자 달리기!! 매우 느림");
    }

    @Override
    public void jump() {
        System.out.println("초급자 점프!! 매우 낮음");
    }

    @Override
    public void atack() {
        System.out.println("초급자 공격!! 공격력 1");
    }

    @Override
    public void showLevel() {
        System.out.println("======@BeginnerLevel@======");
    }
}
