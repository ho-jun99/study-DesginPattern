package prototype;

import java.util.ArrayList;

/*
    깊은 복사를 위해 clone에서 super.clone() 을 호출하지 않고, 새롭게 만들어줌.
    다형성을 이용했기 때문에 반환형이 Object타입이어도 BookShlef를 반환 가능함.
 */

// Cloneable을 상속 받아도 따로 정의할 건 없음, 명시해주는 인터페이스 이를 마크 인터페이스라고도함.
public class BookShelf implements Cloneable{
    private ArrayList<Book> bookList;

    public BookShelf() {
        this.bookList = new ArrayList<Book>();
    }

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public void addBook(Book book) {
        bookList.add(book);
    }

    @Override
    public String toString() {
        return bookList.toString();
    }

    // 다형성을 이용했기 때문에 반환형이 Object타입이어도 BookShlef를 반환 가능
    @Override
    protected Object clone() throws CloneNotSupportedException {
        BookShelf another = new BookShelf();

        for ( Book book: bookList) {
            another.addBook(new Book(book.getTitle(),book.getAuthor()));
        }
        return another;
    }
}
