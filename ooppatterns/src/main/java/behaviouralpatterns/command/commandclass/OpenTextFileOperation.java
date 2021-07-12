package behaviouralpatterns.command.commandclass;

import behaviouralpatterns.command.receiverclass.TextFile;

/**
 * Command
 * A command is an object whose role is to store all the information required for executing an action,
 * including the method to call, the method arguments, and the object (known as the receiver) that implements the method.
 * */
public class OpenTextFileOperation implements TextFileOperation{

    /* class fields */
    private TextFile textFile;

    /* constructor */
    public OpenTextFileOperation(){}

    public OpenTextFileOperation(TextFile textFile){
        this.textFile = textFile;
    }

    /* getters and setters */
    public TextFile getTextFile() {
        return textFile;
    }

    public void setTextFile(TextFile textFile) {
        this.textFile = textFile;
    }

    /* override interface method */
    public String execute(){
        return this.textFile.open();
    }
}
