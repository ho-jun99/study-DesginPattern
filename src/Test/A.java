package Test;

public abstract class A {
    String name;
    int stnumber;


    public A(String name, int stnumber){
        this.name = name;
        this.stnumber = stnumber;
    }

    public void nameNumber(){
        System.out.print(name + stnumber);
    }

    abstract void showPhoneNumber();

}
