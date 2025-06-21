import java.util.ArrayList;
import java.util.List;
//COLLECTIONS
/*BookRepository class
Create the  BookRepository  class, which will be responsible for:
adding  Book  objects
removing  Book  objects
searching for objects of the  Book  type with the indicated name
searching for objects of the  Book  type with the indicated id
removing objects of the  Book  type based on the provided  id
Book class
The  Book  class should include the following elds:
id
title
author
year of release
NoBookFoundException
In case of lack of searched results an exception should be thrown. This
exception should accept the  String  parameter object with information about
which elements could not be found*/
public class BookRepository {

    //Krijojme nje liste te librave
    private List<Book> books;
    //konstruktori metode e vecante qe ka emrin e klases, dhe perdoret per krijimin  e objekteve
    public BookRepository(){
        this.books=new ArrayList<>();
    }

    //metoda per te shtuar nje liber ne liste
    public void addBook(Book book){
        books.add(book);
    }
    //metoda per te hequr librin sipas id
    public void removeBookById(int id)throws NoBookFoundException{
        Book bookFound=findBookById(id);
        books.remove(bookFound);
    }

    //metoda per te gjetur librin sipas id
    public Book findBookById(int id)throws NoBookFoundException{
        for(Book book:books){
            if(book.getId() ==id){
                return book;
            }
        }
            throw new NoBookFoundException("Ky liber me id "+id+" nuk ekziston.");

    }
    //Metoda per te gjetur librin sipas emrit
    public Book findBookByTitle(String title) throws NoBookFoundException{
        for(Book book:books){
            if(book.getTitle().equals(title)){
                return book;
            }
        }
        throw new NoBookFoundException("Ky liber me title "+title+" nuk ekziston.");
    }

    //Metoda per te afishuar te gjitha librat
    public List<Book> getAllBooks(){
        return books;
    }


}
