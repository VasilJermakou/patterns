package behaviouralpatterns.templatemethod;

public class ApplicationRunner {
    public static void main(String[] args) {

        Game game = new Cricket();
        game.run();

        System.out.println("------");

        game = new Football();
        game.run();

    }
}
