package facade;

import Test.B;

public class Facade {
    private Buns buns;
    private Patty patty;
    private Vegetable vege;
    private Assemble assemble;

    Facade(){
        buns = new Buns();
        patty = new Patty();
        vege = new Vegetable();
        assemble = new Assemble(buns,patty,vege);
    }

    public void makeHambuger(){
        buns.burn();
        patty.ready();
        patty.grill();
        vege.wash();
        vege.hand();
        assemble.complete();
    }
}
