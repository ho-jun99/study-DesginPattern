package adapter.fighterExample;

// 이미 게임에서 사용중인 클래스, 수정이 어렵다
public class Wizard {

    private String name;
    private int level;

    Wizard(String name, int level){
        this.name = name;
        this.level = level;
    }
    public void showInfo() {
        System.out.print("[ LEVEL "+ level + ", USERNAME " + name +"]");
    }

    public void shotMagicCloser(){
        showInfo();
        System.out.println("Wizard의 매직클로 공격!");
    }

    public void shield(){
        showInfo();
        System.out.println("Wizard의 방어막경계 생성!");
    }

    public void portal(){
        showInfo();
        System.out.println("Wizard의 포털이동!!");
    }

}
