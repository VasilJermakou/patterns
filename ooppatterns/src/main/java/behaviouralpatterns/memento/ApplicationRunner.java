package behaviouralpatterns.memento;

public class ApplicationRunner {
    public static void main(String[] args) {

        /**
         * The memento pattern is a design pattern that permits
         * the current state of an object to be stored without breaking the rules of encapsulation.
         * The originating object can be modified as required but can be restored to the saved state at any time.
         * */

        Book book = new Book("ISBN-1234", "Java 8", "Herbert Schildt");
        Memento memento1 = book.createMemento();
        Caretaker caretaker = new Caretaker(memento1);

        System.out.println(book.toString());
        System.out.println(memento1.toString());
        System.out.println(caretaker.getMemento().toString());

        System.out.println("-------------------------------");

        book.setIsbn("ISBN-9876");
        book.setTitle("Introduction to C++");
        book.setAuthor("Bjarne Stroustrup");
        System.out.println(book.toString());

        System.out.println("-------------------------------");

        book.setMemento(caretaker.getMemento());
        System.out.println(book.toString());
    }
}
