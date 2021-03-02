import singleton.SingletonPattern;

public class DesignPatternApplication {

    public static void main(String args[]) {
        SingletonPattern.eagerInitialization();
        SingletonPattern.threadSafeLazyInitialization();
    }
}
