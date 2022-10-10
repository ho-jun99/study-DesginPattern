package facade;

public class Assemble {
    Buns buns;
    Patty patty;
    Vegetable vege;

    public Assemble(Buns buns, Patty patty, Vegetable vege){
        this.buns = buns;
        this.patty = patty;
        this.vege = vege;
    }

    public void complete(){
        System.out.println("buns + patty + vegetable을 이용해 햄버거를 완성했습니다.");
    }
}
