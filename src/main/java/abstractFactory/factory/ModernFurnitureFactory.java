package abstractFactory.factory;

import abstractFactory.chair.Chair;
import abstractFactory.chair.ModernChair;
import abstractFactory.table.ModernTable;
import abstractFactory.table.Table;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }
}
