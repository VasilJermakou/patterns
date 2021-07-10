package structuralpatterns.decorator;

public class TreeTopper extends TreeDecorator{

    /* constructor */
    public TreeTopper(ChristmasTree christmasTree){
        super(christmasTree);
    }

    /* business methods */
    public String decorate(){
        return super.decorate() + decorateWithTreeTopper();
    }

    private String decorateWithTreeTopper(){
        return " with Tree Topper";
    }
}
