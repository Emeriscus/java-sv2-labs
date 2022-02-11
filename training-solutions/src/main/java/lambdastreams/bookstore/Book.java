package lambdastreams.bookstore;

public class Book {

    private String title;
    private int yearOfPublish;
    private int price;
    private int stock;

    public Book(String title, int yearOfPublish, int price, int stock) {
        this.title = title;
        this.yearOfPublish = yearOfPublish;
        this.price = price;
        this.stock = stock;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfPublish() {
        return yearOfPublish;
    }

    public int getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }
}
