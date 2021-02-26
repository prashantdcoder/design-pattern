package factoryMethod.pizza;

public abstract class Pizza {

    public static final String VEG = "Veg";
    public static final String NON_VEG = "Non Veg";

    private String name;
    private int size;
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void bake() {
        System.out.println("Baking pizza for 20 minutes");
    }

    public void cut() {
        System.out.println("Cutting pizza in " + size + " slices");
    }

    public void ready() {
        System.out.println("Pizza is ready to be served");
        System.out.println(name + "-" + type + " pizza is here");
    }


}
