public class Book {
    //Fields
    //Kemi perdorur enkapsulism
    private int id;
    private String title;
    private String author;
    private int yearOfRealease;

    public Book(int id, String title, String author, int yearOfRealease) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.yearOfRealease = yearOfRealease;
    }

    //getters

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfRealease() {
        return yearOfRealease;
    }
    //Setters

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYearOfRealease(int yearOfRealease) {
        this.yearOfRealease = yearOfRealease;
    }
//toString method perdoret
    //Abstraksioni emer i njejte, variable te njejte, por implementim te ndryshem, body
    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearOfRealease=" + yearOfRealease +
                '}';
    }
}
