package prototype;

public class Book {
    private String title;
    private String author;

    public Book(String t, String a) {
        title = t;
        author = a;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "(" + title + "," + author +")";
    }
}
