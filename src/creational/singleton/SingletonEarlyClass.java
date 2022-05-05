package creational.singleton;

public class SingletonEarlyClass {
    private static SingletonEarlyClass instance = new SingletonEarlyClass();
    private String ID = "";

    private SingletonEarlyClass(){
    }

    public static SingletonEarlyClass getInstance() { return instance;}

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
}
