package structural.Decorator;

public class CarDecorator implements Car{
    protected  Car car;
    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public void addFeature(){
        this.car.addFeature();
    }
}
