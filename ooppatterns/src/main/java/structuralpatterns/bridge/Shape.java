package structuralpatterns.bridge;

public abstract class Shape {

    /* class fields */
    private Color color;        //bridge between Shape and Color

    /* constructor */
    public Shape(Color color){
        this.color = color;
    }

    /* getters and setters */
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    /* abstract method */
    public abstract String draw();

    /* object method */
    @Override
    public String toString() {
        return "Shape{" +
                "color=" + color +
                '}';
    }
}
