package singleton;

public class LazyInitialization {

    private String name;
    private static LazyInitialization INSTANCE;

    private LazyInitialization() {

    }


    public static LazyInitialization getInstance(String name) {
        if (INSTANCE == null) {
            synchronized (LazyInitialization.class) {
                if (INSTANCE == null) {
                    INSTANCE = new LazyInitialization();
                    INSTANCE.setName(name);
                }
            }
        }
        return INSTANCE;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }
}
