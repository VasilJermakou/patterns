package creationalpatterns.abstractfactory.color;

import creationalpatterns.abstractfactory.color.Color;

public class White implements Color {

    /* class fields */
    private final String color;

    /* constructor */
    public White(){
        this.color = "White";
    }

    /* overriding interface method */
    @Override
    public String getColor() {
        return color;
    }

    /* object method */
    @Override
    public String toString() {
        return "White{" +
                "color='" + color + '\'' +
                '}';
    }
}
