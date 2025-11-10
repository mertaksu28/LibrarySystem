public class Library {
    Book[] books = new Book[10];
    int bookCount = 0;
    int borrowCount = 0;

    void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
            IO.println(book.title + " added to library");
        } else {
            System.out.println("Library full you can't add book");
        }
    }

    void listBooks() {
        for (int i = 0; i < bookCount; i++) {
            books[i].printInfo();
        }
        System.out.println("Total book count " + bookCount);
        IO.println("Total borrowwed count " + borrowCount);
    }

    void borrowBook(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].title.equals(title)) {
                if (!books[i].isBorrowed) {
                    books[i].borrow();
                    borrowCount++;
                } else {
                    books[i].borrow();
                }
                return;
            }
        }
        IO.println(title + " couldnt find book...");
    }
}
