package behaviouralpatterns.command.invokerclass;

import behaviouralpatterns.command.commandclass.TextFileOperation;
import java.util.ArrayList;
import java.util.List;

/**
 * Invoker
 * An invoker is an object that knows how to execute a given command
 * but doesn't know how the command has been implemented. It only knows the command's interface.
 * */
public class TextFileOperationExecutor {

    /* class fields */
    private final List<TextFileOperation> textFileOperations;

    /* constructors */
    public TextFileOperationExecutor(){
        this.textFileOperations = new ArrayList<>();
    }

    /* getter */
    public List<TextFileOperation> getTextFileOperations() {
        return textFileOperations;
    }

    /* business method */
    public String executeOperation(TextFileOperation textFileOperation){
        this.textFileOperations.add(textFileOperation);
        return textFileOperation.execute();
    }
}
