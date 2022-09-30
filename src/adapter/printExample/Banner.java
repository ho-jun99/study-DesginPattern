package adapter.printExample;

public class Banner {
    public String str;

    Banner(String str){
        this.str = str;
    }

    public void showWithParen(){
        System.out.println("(" + str + ")");
    }

    public void showWithAster(){
        System.out.println("*" + str + "*");
    }

}
