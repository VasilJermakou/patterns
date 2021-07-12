package behaviouralpatterns.templatemethod;

public class Cricket extends Game{

    /* constructor */
    public Cricket(){
        super();
    }

    /* overriding abstract methods */
    @Override
    public void initGame() {
        System.out.println("Initialize the cricket game ...");
    }

    @Override
    public void startGame() {
        System.out.println("Starting cricket, enjoy the game!");
    }

    @Override
    public void endGame() {
        System.out.println("Finished cricket!");
    }

}
