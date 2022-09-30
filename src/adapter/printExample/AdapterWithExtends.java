package adapter.printExample;

public class AdapterWithExtends extends Banner implements Print{
    AdapterWithExtends(String str) {
        super(str);
    }


    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
