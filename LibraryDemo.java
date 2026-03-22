class Book {
    String title, author;
    double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println(title + " | " + author + " | " + price);
    }
}

public class LibraryDemo {
    public static void main(String[] args) {
        Book[] books = {
            new Book("Java", "James", 500),
            new Book("Python", "Guido", 400),
            new Book("C++", "Bjarne", 600)
        };

        for (Book b : books) {
            b.display();
        }
    }
}