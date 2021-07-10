package structuralpatterns.adapter;

public class BirdAdapter implements ToyBird{

    /* class fields */
    private Bird bird;

    /* constructor */
    public BirdAdapter(Bird bird){
        this.bird = bird;
    }

    /* getters and setters */
    public Bird getBird() {
        return bird;
    }

    public void setBird(Bird bird) {
        this.bird = bird;
    }

    /* overriding interface method */
    public void makeSound(){
        bird.makeSound();
    }

    public void fly(){
        bird.fly();
    }

    /* object method */
    @Override
    public String toString() {
        return "BirdAdapter{" +
                "bird=" + bird +
                '}';
    }
}
