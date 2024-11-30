package creational.singleton.eager;



public class Main {
    public static void main(String[] args) {
        Singleton eagerInit = Singleton.getInstance();
        eagerInit.performAction(System.out::println);
        Singleton anotherInstance = Singleton.getInstance();
        System.out.println(eagerInit == anotherInstance);
    }
}
