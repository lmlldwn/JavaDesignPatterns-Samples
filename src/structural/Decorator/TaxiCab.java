package structural.Decorator;

public class TaxiCab extends CarDecorator{
    public TaxiCab(Car car){
        super(car);
    }

    @Override
    public void addFeature(){
        super.addFeature();
        System.out.println("Adding taxi cab features.");
    }
}
