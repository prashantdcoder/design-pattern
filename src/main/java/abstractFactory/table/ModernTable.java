package abstractFactory.table;

public class ModernTable implements Table {
    @Override
    public void showDetails() {
        System.out.println("Modern table");
        System.out.println("Type:  Modern");
        System.out.println("Color: Brown");
        System.out.println("Size:  18");
    }
}
