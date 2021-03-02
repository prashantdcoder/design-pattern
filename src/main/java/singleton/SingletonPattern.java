package singleton;

import java.util.ArrayList;
import java.util.List;

public class SingletonPattern {

    public static void eagerInitialization() {
        EagerInitialization instance1 = EagerInitialization.getInstance();
        EagerInitialization instance2 = EagerInitialization.getInstance();
        System.out.println(instance1 == instance2);

    }

    public static void threadSafeLazyInitialization() {
        List<Thread> threadList = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            if (i % 2 == 0) {
                threadList.add(new Thread(new JavaThread()));
            } else {
                threadList.add(new Thread(new PythonThread()));
            }
        }

        for (Thread thread : threadList) {
            thread.start();
        }
    }

    static class JavaThread implements Runnable {
        @Override
        public void run() {
            LazyInitialization ob = LazyInitialization.getInstance("Java");
            System.out.println(ob.getName());
        }
    }

    static class PythonThread implements Runnable {
        @Override
        public void run() {
            LazyInitialization ob = LazyInitialization.getInstance("Python");
            System.out.println(ob.getName());
        }
    }
}

