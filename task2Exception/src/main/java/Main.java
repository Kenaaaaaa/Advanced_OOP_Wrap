public class Main {
    public static void main(String[] args) {
        //Kur nuk jane statike metodat, per ti thirrur duhet te krijojme objekte

        BookRepository bookRepository = new BookRepository();

        //shtimin e librave
        bookRepository.addBook(new Book(1,"titulli1","author1",1999));
        bookRepository.addBook(new Book(2,"titulli2","author2",2000));
        bookRepository.addBook(new Book(3,"titulli3","author3",1999));

        //afishimi
        System.out.println("Keto jane te gjitha librat");
        bookRepository.getAllBooks().forEach(System.out::print);

        try{
            //Gjej librin sipas emrit
            System.out.println("Search for 'Title1");
            System.out.println(bookRepository.findBookByTitle("titulli1"));

            //Heqja e nje libri sipas id
            System.out.println("Hiq librin me id2");
            bookRepository.removeBookById(2);
            bookRepository.getAllBooks().forEach(System.out::println);

            //Gjej nje liber qe nuk ekziston
            System.out.println("Search for title 4");
            System.out.println(bookRepository.findBookByTitle("titulli4"));

        }
        catch(NoBookFoundException e){
            System.out.println("Error"+e.getMessage());
        }


    }



}
