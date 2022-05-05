package structural.flyweight;

import java.util.HashMap;

public class ShapeFactory {
    private static final HashMap circleMap = new HashMap();// didn't use <,>(generics) to be able to accept objects //can also be used to shapeMap
    public static Shape getCircle(String color) {
        Circle circle = (Circle)circleMap.get(color); //type casting
        if(circle == null){
            circle = new Circle(color);
            circleMap.put(color,circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}