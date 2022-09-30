package adapter.printExample;

public class AdapterWithImplements implements Print{

    Banner banner;

    AdapterWithImplements(String str){
        banner = new Banner(str);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
