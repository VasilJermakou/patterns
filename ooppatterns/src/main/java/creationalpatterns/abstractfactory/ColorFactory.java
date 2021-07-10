package creationalpatterns.abstractfactory;

import creationalpatterns.abstractfactory.color.Color;
import creationalpatterns.abstractfactory.color.Red;
import creationalpatterns.abstractfactory.color.White;

public class ColorFactory implements AbstractFactory<Color>{

    /* overriding interface method */
    @Override
    public Color create(String entityType) {
        if(entityType.equalsIgnoreCase("Red"))
            return new Red();
        else if(entityType.equalsIgnoreCase("White"))
            return new White();

        return null;
    }
}
