package creationalpatterns.singleton;

public class ApplicationRunner {
    public static void main(String[] args) {

        Singleton singletonA = Singleton.getInstance();
        Singleton singletonB = Singleton.getInstance();

        System.out.println("singletonA == singletonB : " + (singletonA == singletonB));     //true

    }
}
