package creational.singleton;

public class Main {
    public static void main(String[] args){
        SingletonEarlyClass instance1 = SingletonEarlyClass.getInstance();
        instance1.setID("Sample for Instance 1");
        System.out.println("Instance 1 ID" + instance1.getID());

        SingletonEarlyClass instance2 = SingletonEarlyClass.getInstance();
        System.out.println("Instance 2 ID" + instance2.getID());

        /*
        SingletonLazyClass instanceOne = new SingletonLazyClass.getInstance();

        SingletonLazyClass instanceTwo = new SingletonLazyClass.getInstance();

        instanceOne.setID("I am instance ONE!");
        System.out.println("Instance one ID " + instanceOne.getID());
        System.out.println("Instance one ID " + instanceTwo.getID());

        instanceTwo.setID("I am instance TWO!");
        System.out.println("Instance one ID " + instanceOne.getID());
        System.out.println("Instance one ID " + instanceTwo.getID());

        */

    }
}
