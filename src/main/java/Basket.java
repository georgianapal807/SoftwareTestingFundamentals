import java.util.ArrayList;
import java.util.List;

public class Basket {
    List<Book> bookList;

    public Basket() {
        this.bookList = new ArrayList<>();
    }

    public void addBook(Book book) {
        bookList.add(book);
    }

    @Override
    public String toString() {
        return "Basket{" +
                "bookList=" + bookList +
                '}';
    }

    public Book getBook(int index) {
        return bookList.get(index);
    }

    public Basket clearBasket(){
       return null;
    }

    public int sumOfAllBooks(){
        int sum=0;
        for (int i=0; i<bookList.size();i++){
            sum+=bookList.get(i).price;
        }
        return sum;
    }
}
