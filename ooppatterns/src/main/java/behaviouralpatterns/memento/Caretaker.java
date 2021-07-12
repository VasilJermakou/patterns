package behaviouralpatterns.memento;

/**
 * Caretaker
 * The Caretaker class is used to hold a Memento object for later use.
 *
 * */
public class Caretaker {

    /* class fields */
    private Memento memento;

    /* constructor */
    public Caretaker(){}

    public Caretaker(Memento memento){
        this.memento = memento;
    }

    /* getters and setters */
    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
