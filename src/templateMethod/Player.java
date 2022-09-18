package templateMethod;

public class Player {
    PlayerLevel myLevel;

    public Player(){
        System.out.println("캐릭터가 생성 됐습니다");
        myLevel = new BeginnerLevel();
        myLevel.showLevel();
    }

    public void levelUp(PlayerLevel level) {
        level.showLevel();
        myLevel = level;
    }

    public void play(int jumpCount) {
        myLevel.go(jumpCount);
    }

}
