package structuralpatterns.decorator;

public class MyChristmasTree implements ChristmasTree{

    /* overriding interface method */
    @Override
    public String decorate() {
        return "My ChristmasTree ";
    }
}
