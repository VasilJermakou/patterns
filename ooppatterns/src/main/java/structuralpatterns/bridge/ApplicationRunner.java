package structuralpatterns.bridge;

public class ApplicationRunner {
    public static void main(String[] args) {

        Color red = new Red();
        Shape square = new Square(red);

        System.out.println(red.fill());
        System.out.println(square.draw());

    }
}
