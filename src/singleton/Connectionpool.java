package singleton;


import java.util.ArrayList;

/*
    싱글톤 패턴 요약

    소프트웨어(프로그램 내) 하나의 인스턴스만을 사용하기 위해서 사용하는 패턴이다.
    static으로 선언하는 경우 클래스를 생성하지 않고, jvm에 올라가면서 메모리에 잡힌다. 이것을 이용한다.
    디폴트 생성자를 private로 바꾸줌으로써 다른 곳에서는 해당 클래스의 인스터스를 생성할 수 없도록한다.

    getInstance메서드 역시 static으로 선언해야 한다. 왜냐하면 인스턴스 자체를 생성할 수 없기 때문에 static으로 정의하지 않으면
    함수 자체를 사용 할 수 없다.
    인스턴스의 존재 유무를 검사하고, 없다면 새로운 인스턴스를 만들고 반환한다.
 */
public class Connectionpool {
    private static Connectionpool connectionpool = new Connectionpool();
    private Connectionpool(){}

    public ArrayList<String> connectionList = new ArrayList<String>();

    public void getArray() {
        for ( int i=0; i<connectionList.size(); i++) {
            System.out.println(connectionList.get(i));
        }
    }

    public static Connectionpool getInstance() {
        if ( connectionpool == null) {
            connectionpool = new Connectionpool();
        }
        return connectionpool;
    }

}
