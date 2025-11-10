public class Main {
    public static void main(String[] args) {
        Book firstBook = new Book();
        firstBook.setValues("Suc ve Ceza", "Dostoyevski");
        Book secondBook = new Book();
        secondBook.setValues("Kurk Mantolu Madonna", " Sebahattin Ali");
        Book thirdBook = new Book();
        thirdBook.setValues("1984", "Georgia Orwell");

        Library library = new Library();
        library.addBook(firstBook);
        library.addBook(secondBook);
        library.addBook(thirdBook);
        IO.println("------------");
        library.listBooks();

    }
}
