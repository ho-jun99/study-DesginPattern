package templateMethod;

public abstract class PlayerLevel {
    public abstract void run();
    public abstract void jump();
    public abstract void atack();
    public void fly() {}

    public abstract void showLevel();

    public final void go(int count){
        run();
        for(int i=0; i<count; i++){
            jump();
        }
        atack();
        fly();
        System.out.println();
    }
}
