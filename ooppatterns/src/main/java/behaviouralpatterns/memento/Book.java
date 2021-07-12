package behaviouralpatterns.memento;

/**
 * Originator
 * This is the class whose state is to be stored.
 * */
public class Book {

    /* class fields */
    private String isbn;
    private String title;
    private String author;

    /* constructors */
    public Book(){
        this.isbn = "0";
        this.title = "NO_TITLE";
        this.author = "NO_AUTHOR";
    }

    public Book(String isbn, String title, String author){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    /* getters and setters */
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    /* memento methods */
    public Memento createMemento(){
        return new Memento(isbn, title, author);
    }

    public void setMemento(Memento memento){
        this.isbn = memento.getIsbn();
        this.title = memento.getTitle();
        this.author = memento.getAuthor();
    }

    /* object methods */
    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
