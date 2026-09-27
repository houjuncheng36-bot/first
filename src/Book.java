public class Book {
    private String title;
    private String author;
    private int id;
    private double price;
    private int output;
    private boolean isExistence;

    public Book(String title, String author,int id, double price) {
        this.title = title;
        this.author = author;
        this.id = id;
        this.price = price;
        this.output = 0;
        this.isExistence = true;
    }
}
