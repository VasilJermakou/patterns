package structuralpatterns.bridge;

public class White implements Color{

    /* overriding interface method */
    @Override
    public String fill() {
        return "color is white";
    }
}
