package Singleton;

public class Main {
    public static void main(String[] args) {
        SingletonExample singletonExample = SingletonExample.getInstance();
        System.out.println(singletonExample.getPatternName());
    }
}
