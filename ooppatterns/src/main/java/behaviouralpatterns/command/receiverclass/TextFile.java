package behaviouralpatterns.command.receiverclass;

/**
 * Receiver
 * A receiver is an object that performs a set of cohesive actions.
 * It's the component that performs the actual action when the command's execute() method is called.
 * */
public class TextFile {

    /* class fields */
    private String name;

    /* constructor */
    public TextFile(){}

    public TextFile(String name){
        this.name = name;
    }

    /* getters and setters */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /* business methods */
    public String open(){
        return "Opening file " + this.name;
    }

    public String save(){
        return "Saving file " + this.name;
    }
}
