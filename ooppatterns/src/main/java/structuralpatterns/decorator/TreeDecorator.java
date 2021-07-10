package structuralpatterns.decorator;

public abstract class TreeDecorator implements ChristmasTree {

    /* class fields */
    private ChristmasTree christmasTree;

    /* constructor */
    public TreeDecorator(ChristmasTree christmasTree){
        this.christmasTree = christmasTree;
    }

    /* getters and setters */
    public ChristmasTree getChristmasTree() {
        return christmasTree;
    }

    public void setChristmasTree(ChristmasTree christmasTree) {
        this.christmasTree = christmasTree;
    }

    /* overriding interface method */
    public String decorate(){
        return this.christmasTree.decorate();
    }
}
