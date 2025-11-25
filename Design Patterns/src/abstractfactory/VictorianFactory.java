package abstractfactory;

public class VictorianFactory implements AbstractFactory{
    @Override
    public Table createTable() {
        return new VictorianTable();
    }

    @Override
    public Chair createChair() {
        return new VictorianChair();
    }
}
