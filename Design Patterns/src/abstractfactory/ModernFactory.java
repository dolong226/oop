package abstractfactory;

public class ModernFactory implements AbstractFactory{
    @Override
    public Table createTable() {
        return new ModernTable();
    }

    @Override
    public Chair createChair() {
        return new ModernChair();
    }
}
