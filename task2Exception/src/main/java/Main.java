public class Main {
    public static void main(String[] args) {
        //Kur nuk jane statike metodat, per ti thirrur duhet te krijojme objekte

        BookRepository bookRepository = new BookRepository();

        //shtimin e librave
        bookRepository.addBook(new Book(1,"titulli1","author1",1999));
        bookRepository.addBook(new Book(2,"titulli2","author2",2000));
        bookRepository.addBook(new Book(3,"titulli3","author3",1999));
    }

}
