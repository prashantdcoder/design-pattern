package abstractFactory.factory;

import abstractFactory.chair.Chair;
import abstractFactory.table.Table;

public interface FurnitureFactory {

    Chair createChair();

    Table createTable();
}
