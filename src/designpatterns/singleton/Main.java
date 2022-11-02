package designpatterns.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton anotherSingleton = Singleton.getInstance();
        System.out.println("Is singleton? " + (singleton == anotherSingleton));
    }
}
