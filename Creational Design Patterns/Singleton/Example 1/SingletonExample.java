package Singleton;

/**
 * Singleton
 */
public class SingletonExample {

    private static SingletonExample mInstance = null;

    public static SingletonExample getInstance() {
        if (mInstance == null) {
            mInstance = new SingletonExample();
        }
        return mInstance;
    }

    private SingletonExample() {
    }

    public String getPatternName() {
        return "Singleton Pattern";
    }
}