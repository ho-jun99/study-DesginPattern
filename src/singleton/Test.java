package singleton;

public class Test {

    public static void main(String args[]) {

        // Connectionpool con = new Connectionpool() 인스턴스를 생성 할 수 없음.

        Connectionpool con1 = Connectionpool.getInstance();
        Connectionpool con2 = Connectionpool.getInstance();

        System.out.println("con1 : " + con1);
        System.out.println("con2 : " + con1);
        System.out.println("con1 == con2 : " +  (con1 == con2));

        con1.connectionList.add("1");
        con1.connectionList.add("2");
        con1.connectionList.add("3");

        con2.getArray();

    }
}
