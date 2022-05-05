package creational.singleton;

public class SingletonLazyClass {
    private static SingletonLazyClass instance = null;
    private String ID = "";

    private SingletonLazyClass(){ }

    public static SingletonLazyClass getInstance(){
        if(instance !=null){
            instance = new SingletonLazyClass();
        }
        return instance;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
}
