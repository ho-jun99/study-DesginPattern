package templateMethod.test;

import templateMethod.*;

public class Test {
    public static void main(String[] args) {

        Player hojun = new Player();
        hojun.play(3);

        PlayerLevel advanced = new AdvancedLevel();
        hojun.levelUp(advanced);
        hojun.play(2);

        PlayerLevel superLevel = new SuperLevel();
        hojun.levelUp(superLevel);
        hojun.play(3);
    }
}
