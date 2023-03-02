import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    @Test
    public void addingABookTEST() {
        Book book1 = new Book("Lord of the Rings", "J.R.R.Tolkein", 100);
        Book book2 = new Book("Harry Potter", "J.K.Rowling", 230);
        Book book3 = new Book("Cheia labirintului", "Howard W.Hendrics", 45);
        Basket basket = new Basket();
        basket.addBook(book1);
        basket.addBook(book2);
        basket.addBook(book3);
        Book book4 = new Book("Titlul meu", "Autorul meu", 100);
        basket.addBook(book4);
        Assertions.assertEquals(basket.getBook(3).equals(book4), true);
    }

    @Test
    public void clearTheBasketTEST() {
        Book book1 = new Book("Lord of the Rings", "J.R.R.Tolkein", 100);
        Book book2 = new Book("Harry Potter", "J.K.Rowling", 230);
        Book book3 = new Book("Cheia labirintului", "Howard W.Hendrics", 45);
        Basket basket = new Basket();
        basket.addBook(book1);
        basket.addBook(book2);
        basket.addBook(book3);
        basket.clearBasket();
        Assertions.assertEquals(basket.clearBasket(), null);
    }

    @Test
    public void sumOfAllBookTEST() {
        Book book1 = new Book("Lord of the Rings", "J.R.R.Tolkein", 100);
        Book book2 = new Book("Harry Potter", "J.K.Rowling", 230);
        Book book3 = new Book("Cheia labirintului", "Howard W.Hendrics", 45);
        Basket basket = new Basket();
        basket.addBook(book1);
        basket.addBook(book2);
        basket.addBook(book3);
        Assertions.assertEquals(basket.sumOfAllBooks(), 375);
    }
}