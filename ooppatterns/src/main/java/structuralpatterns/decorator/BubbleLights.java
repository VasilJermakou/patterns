package structuralpatterns.decorator;

public class BubbleLights extends TreeDecorator{

    /* constructor */
    public BubbleLights(ChristmasTree christmasTree){
        super(christmasTree);
    }

    /* business methods */
    public String decorate(){
        return super.decorate() + decorateWithBubbleLights();
    }

    private String decorateWithBubbleLights(){
        return " with Bubble Lights";
    }
}
