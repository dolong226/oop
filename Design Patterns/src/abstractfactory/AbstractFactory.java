package abstractfactory;

/**
 * Abstract Factory is a creational design pattern that lets you produce families of related
 * objects without specifying their concrete classes.
 */
public interface AbstractFactory {
    Table createTable();
    Chair createChair();
}
