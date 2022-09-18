package templateMethod;


public class SuperLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("운영자 달리기!! 텔레포트급임");
    }

    @Override
    public void jump() {
        System.out.println("운영자 점프!! 개높음");
    }

    @Override
    public void atack() {
        System.out.println("운영자 공격!! 한방컷");
    }

    @Override
    public void showLevel() {
        System.out.println("======@SuperLevel@======");
    }

    @Override
    public void fly() {
        System.out.println("운영자는 날수 있습니다!");
    }
}
