package prototype;

/*
    프로토타입 패턴.
    생성 패턴 중에 하나이다.
    DB로 부터 데이터를 가져와 수정 작업을 거칠때 매번 새로운 인스턴스를 호출하는 일은 자원 소모가 큰 일이기 때문에
    프로토타입을 clone하는 방식을 사용함.
 */

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException{

        BookShelf orginalShelf = new BookShelf();

        orginalShelf.addBook(new Book("안드로이드 정복","김호준"));
        orginalShelf.addBook(new Book("스프링 정복","이호준"));
        orginalShelf.addBook(new Book("디자인 패턴 정복","박호준"));

        System.out.println("orginalShelf :  "+orginalShelf);

        BookShelf copyShelf = (BookShelf)orginalShelf.clone(); // object로 반환하기 때문에 다운캐스팅을 해줘야함
        System.out.println("copyShelf :  "+copyShelf);

        System.out.println("=========================");
        // 깊은 복사가 이루어졌는지 확인
        Book temp = copyShelf.getBookList().get(0);
        temp.setAuthor("한강");
        temp.setTitle("조정래");

        System.out.println("orginalShelf :  "+orginalShelf);
        System.out.println("copyShelf :  "+copyShelf);

    }
}
