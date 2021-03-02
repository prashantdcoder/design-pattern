package abstractFactory;

import abstractFactory.chair.Chair;
import abstractFactory.factory.FurnitureFactory;
import abstractFactory.table.Table;

public class Furniture {

    private Chair chair;
    private Table table;

    Furniture(FurnitureFactory furnitureFactory) {
        this.chair = furnitureFactory.createChair();
        this.table = furnitureFactory.createTable();
    }

    public void getChair() {
        this.chair.showDetails();
    }

    public void getTable() {
        this.table.showDetails();
    }

}
