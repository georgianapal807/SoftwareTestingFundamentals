public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Lord of the Rings", "J.R.R.Tolkein", 100);
        Book book2 = new Book("Harry Potter", "J.K.Rowling", 230);
        Book book3 = new Book("Cheia labirintului", "Howard W.Hendrics", 45);
        Basket basket = new Basket();
        basket.addBook(book1);
        basket.addBook(book2);
        basket.addBook(book3);
        System.out.println(basket.toString());
    }
}
