package abstractFactory.factory;

import abstractFactory.chair.Chair;
import abstractFactory.chair.VictorianChair;
import abstractFactory.table.Table;

public class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Table createTable() {
        return null;
    }
}
