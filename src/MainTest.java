import iterator.Book;
import iterator.BookShelf;
import iterator.MyIterator;

/**
 * @Description :
 * @Author :
 */
public class MainTest {
    public static void main(String[] args) {
        testIterator();
    }

    private static void testIterator() {
        BookShelf bookShelf = new BookShelf(5);
        bookShelf.addBook(new Book("t1"));
        bookShelf.addBook(new Book("t2"));
        bookShelf.addBook(new Book("t3"));
        bookShelf.addBook(new Book("t4"));
        MyIterator<Book> iterator = bookShelf.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }
    }
}
