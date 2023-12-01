import java.util.HashMap;
import java.util.Map;

class Book {
    private int id;
    private String name;
    private String author;
    private double price;

    public Book(int id, String name, String author, double price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }
}

class QuantityCollection {
    private Map<Integer, Integer> quantityMap = new HashMap<>();

    public void increaseQuantity(int bookId) {
        quantityMap.put(bookId, quantityMap.getOrDefault(bookId, 0) + 1);
    }

    public void decreaseQuantity(int bookId) {
        if (quantityMap.containsKey(bookId) && quantityMap.get(bookId) > 0) {
            quantityMap.put(bookId, quantityMap.get(bookId) - 1);
        }
    }

    public Map<Integer, Integer> getQuantityMap() {
        return quantityMap;
    }
}

class DAO {
    private QuantityCollection quantityCollection = new QuantityCollection();

    public String addBook(Book book) {
        quantityCollection.increaseQuantity(book.getId());
        return "Book added successfully!";
    }

    public String removeBook(int bookId) {
        quantityCollection.decreaseQuantity(bookId);
        return "Book with ID " + bookId + " removed successfully!";
    }

    public Map<Integer, Integer> getBooksAvailable() {
        return quantityCollection.getQuantityMap();
    }

    public Book getBookDetails(int bookId) {
        Book book1 = new Book(1, "Book1", "Author1", 20.0);
        Book book2 = new Book(2, "Book2", "Author2", 25.0);

        if (book1.getId() == bookId) {
            return book1;
        } else if (book2.getId() == bookId) {
            return book2;
        } else {
            return null; 
        }
    }
}

public class test {
    public static void main(String[] args) {
        DAO dao = new DAO();

        Book book1 = new Book(1, "Book1", "Author1", 20.0);
        Book book2 = new Book(2, "Book2", "Author2", 25.0);
        System.out.println(dao.addBook(book1));
        System.out.println(dao.addBook(book2));
        System.out.println(dao.getBooksAvailable());
        System.out.println(dao.removeBook(1));
        System.out.println(dao.getBooksAvailable());  
        System.out.println(dao.getBookDetails(1));  
}
}
