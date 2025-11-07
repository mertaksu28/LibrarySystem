public class Book {
    String title;
    String author;
    boolean isBorrowed;

    void setValues(String title, String author) {
        title = title;
        author = author;
        isBorrowed = false;
    }

    void borrow() {
        if (!isBorrowed) {
            isBorrowed = true;
            IO.println(title + " name book borrowed.");
        } else {
            IO.println(title + " already borrowed");
        }
    }

    void returnBook() {
        if (isBorrowed) {
            isBorrowed = false;
            IO.println((title + " book returned"));
        } else {
            IO.println(title + " already in library");
        }
    }

    void printInfo() {
        IO.println("Book: " + title + " Author: " + author + " borrowed: " + isBorrowed);
    }

}
