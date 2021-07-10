package creationalpatterns.abstractfactory.color;

import creationalpatterns.abstractfactory.color.Color;

public class Red implements Color {

    /* class fields */
    private final String color;

    /* constructor */
    public Red(){
        this.color = "Red";
    }

    /* overriding interface method */
    @Override
    public String getColor() {
        return color;
    }

    /* object method */
    @Override
    public String toString() {
        return "Red{" +
                "color='" + color + '\'' +
                '}';
    }
}
