package behaviouralpatterns.templatemethod;

public abstract class Game {

    /* constructor */
    public Game(){}

    /* abstract methods */
    public abstract void initGame();
    public abstract void startGame();
    public abstract void endGame();

    /* Template method */
    public void run(){
        initGame();
        startGame();
        endGame();
    }
}
