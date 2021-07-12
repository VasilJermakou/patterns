package behaviouralpatterns.command;

import behaviouralpatterns.command.commandclass.OpenTextFileOperation;
import behaviouralpatterns.command.commandclass.SaveTextFileOperation;
import behaviouralpatterns.command.invokerclass.TextFileOperationExecutor;
import behaviouralpatterns.command.receiverclass.TextFile;

public class ApplicationRunner {
    public static void main(String[] args) {

        /**
         * The pattern intends to encapsulate in an object all the data required for performing a given action (command),
         * including what method to call, the method's arguments, and the object to which the method belongs.
         * This model allows us to decouple objects that produce the commands from their consumers,
         * so that's why the pattern is commonly known as the producer-consumer pattern.
         * In a classic implementation, the command pattern requires implementing four components:
         * the Command, the Receiver, the Invoker, and the Client.
         *
         * Let's suppose that we want to develop a text file application.
         * In such a case, we should implement all functionality required for performing some text-file related operations,
         * such as opening, writing, saving a text file, and so forth.
         * */

        TextFile file1 = new TextFile("file1.txt");
        OpenTextFileOperation openFile = new OpenTextFileOperation(file1);

        TextFile file2 = new TextFile("file2.txt");
        SaveTextFileOperation saveFile = new SaveTextFileOperation(file2);

        TextFileOperationExecutor executor = new TextFileOperationExecutor();
        System.out.println(executor.executeOperation(openFile));
        System.out.println(executor.executeOperation(saveFile));

    }
}
