package structuralpatterns.adapter;

public class ApplicationRunner {
    public static void main(String[] args) {

        Bird duck = new Duck();
        duck.makeSound();
        duck.fly();

        System.out.println("------------------");

        ToyBird toyDuck = new ToyDuck();
        toyDuck.makeSound();

        System.out.println("------------------");

        BirdAdapter birdAdapter = new BirdAdapter(duck);
        birdAdapter.makeSound();
        birdAdapter.fly();

        birdAdapter.setBird(new Duck("Scrooge McDuck"));
        birdAdapter.makeSound();
        birdAdapter.fly();
    }
}
