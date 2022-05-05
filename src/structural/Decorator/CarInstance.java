package structural.Decorator;

public class CarInstance implements Car{

    @Override
    public void addFeature(){
        System.out.println("Basic Feature");
    }
}
