package creational.singleton.lazy;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.performAction(System.out::println);
        Singleton anotherInstance = Singleton.getInstance();
        System.out.println(singleton == anotherInstance);
    }
}
