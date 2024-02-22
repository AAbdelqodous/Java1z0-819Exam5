package q25;

public class Test {
    public static void main(String[] args) {
        Creator<Book> obj = Book::new;
        obj.create();
        obj.create().toString();
    }
}
