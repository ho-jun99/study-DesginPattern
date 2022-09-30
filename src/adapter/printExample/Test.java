package adapter.printExample;

public class Test {
    public static void main(String[] args) {

        Print p = new AdapterWithImplements("HELLO, Implements!");
        p.printStrong();
        p.printWeak();

        System.out.println(" ====== ");

        Print p2 = new AdapterWithExtends("Hello, Extends!");
        p2.printStrong();
        p2.printWeak();
    }
}
