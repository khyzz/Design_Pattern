package iterator;

/**
 * @Description : 集合类（类似与ArrayList）
 * @Author :
 */
public class BookShelf implements Aggregate<Book> {

    private Book[] books;

    private int last = 0;

    public BookShelf(int maxsize) {
        books = new Book[maxsize];
    }

    public Book getBook(int index) {
        return books[index];
    }

    public void addBook(Book book) {
        books[last++] = book;
    }

    public int length() {
        return  last;
    }

    @Override
    public MyIterator<Book> iterator() {
        return new BookShelfIterator();
    }


    private class BookShelfIterator implements MyIterator<Book> {

        private BookShelf bookShelf;

        private int index;

        public BookShelfIterator() {
            this.bookShelf = BookShelf.this;
            this.index = 0;
        }

        @Override
        public boolean hasNext() {
            return index < bookShelf.length();
        }

        @Override
        public Book next() {
            return bookShelf.getBook(index++);
        }

    }
}
