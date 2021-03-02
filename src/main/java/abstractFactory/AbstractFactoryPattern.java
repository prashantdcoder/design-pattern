package abstractFactory;

import abstractFactory.factory.FurnitureFactory;
import abstractFactory.factory.ModernFurnitureFactory;
import abstractFactory.factory.VictorianFurnitureFactory;

public class AbstractFactoryPattern {

    public static void execute() {
        FurnitureFactory furnitureFactory = new VictorianFurnitureFactory();
        Furniture furniture = new Furniture(furnitureFactory);
        furniture.getChair();

        furnitureFactory = new ModernFurnitureFactory();
        furniture = new Furniture(furnitureFactory);
        furniture.getTable();
    }
}
