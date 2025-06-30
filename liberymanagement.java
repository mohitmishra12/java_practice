
import java.util.ArrayList;
import java.util.Scanner;

// Book Class
class Book {
    private String title;
    private String author;
    private boolean isIssued;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void setIssued(boolean issued) {
        isIssued = issued;
    }

    // Display book details
    public void displayBookDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", Issued: " + (isIssued ? "Yes" : "No"));
    }
}

// Library Class
class Library {
    private ArrayList<Book> books = new ArrayList<>();

    // Add a book to the library
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully!");
    }

    // Display all books
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
        } else {
            System.out.println("Books available in the library:");
            for (Book book : books) {
                book.displayBookDetails();
            }
        }
    }

    // Issue a book to a user
    public void issueBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (book.isIssued()) {
                    System.out.println("Book is already issued.");
                } else {
                    book.setIssued(true);
                    System.out.println("Book issued successfully!");
                }
                return;
            }
        }
        System.out.println("Book not found!");
    }

    // Return a book
    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (!book.isIssued()) {
                    System.out.println("Book is not issued.");
                } else {
                    book.setIssued(false);
                    System.out.println("Book returned successfully!");
                }
                return;
            }
        }
        System.out.println("Book not found!");
    }
}

// Main Class
public class liberymanagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    Book book = new Book(title, author);
                    library.addBook(book);
                    break;
                case 2:
                    library.displayBooks();
                    break;
                case 3: // Issue Book
                    System.out.print("Enter the title of the book to issue: ");
                    String issueTitle = scanner.nextLine();
                    library.issueBook(issueTitle);
                    break;
                case 4: // Return Book
                    System.out.print("Enter the title of the book to return: ");
                    String returnTitle = scanner.nextLine();
                    library.returnBook(returnTitle);
                    break;
                case 5: // Exit
                    System.out.println("Exiting Library Management System. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
