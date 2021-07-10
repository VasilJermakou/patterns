package creationalpatterns.singleton;

public class Singleton {

    /* static class fields */
    private static Singleton INSTANCE;

    /* constructors */
    private Singleton(){}

    /* business methods */
    public static Singleton getInstance(){
        if(INSTANCE == null)
            INSTANCE = new Singleton();

        return INSTANCE;
    }
}
