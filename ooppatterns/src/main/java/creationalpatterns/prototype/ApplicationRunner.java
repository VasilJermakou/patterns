package creationalpatterns.prototype;

public class ApplicationRunner {
    public static void main(String[] args) {

        Tree oak = new Oak(15, 36);
        System.out.println(oak.toString());

        Tree copyOak = oak.copy();
        System.out.println(copyOak.toString());

        System.out.println(oak == copyOak);     //false
    }
}
