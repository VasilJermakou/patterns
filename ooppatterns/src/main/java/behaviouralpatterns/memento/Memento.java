package behaviouralpatterns.memento;

/**
 * Memento
 * The Memento class is used to hold the information from an Originator's state.
 * */
public class Memento {

    /* class fields */
    private String isbn;
    private String title;
    private String author;

    /* constructor */
    public Memento(String isbn, String title, String author){
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

    /* object methods */
    @Override
    public String toString() {
        return "Memento{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
