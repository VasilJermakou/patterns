package structuralpatterns.bridge;

public class Square extends Shape{

    /* constructor */
    public Square(Color color){
        super(color);
    }

    /* overriding abstract method */
    @Override
    public String draw() {
        return "Draw square " + getColor().fill();
    }
}
