package structuralpatterns.bridge;

public class Red implements Color{

    /* overriding interface method */
    @Override
    public String fill() {
        return "color is red";
    }
}
