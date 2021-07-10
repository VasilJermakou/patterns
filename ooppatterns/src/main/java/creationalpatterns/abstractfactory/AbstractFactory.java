package creationalpatterns.abstractfactory;

public interface AbstractFactory<T> {

    T create(String entityType);
}
