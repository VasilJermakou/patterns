package behaviouralpatterns.templatemethod;

public class Football extends Game{

    /* constructor */
    public  Football(){
        super();
    }

    /* overriding abstract methods */
    @Override
    public void initGame() {
        System.out.println("Initialize the football game ...");
    }

    @Override
    public void startGame() {
        System.out.println("Starting football, enjoy the game!");
    }

    @Override
    public void endGame() {
        System.out.println("Finished football!");
    }
}
