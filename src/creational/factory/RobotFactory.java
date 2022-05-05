package creational.factory;

import creational.factory.robot.DoorBuilderRobot;
import creational.factory.robot.FrameBuilderRobot;
import creational.factory.robot.TesterRobot;
import creational.factory.robot.WiringBuilderRobot;

public class RobotFactory {

    public Robot getRobot(String action){
        if(action == null){
            return null;
        }

        if (action.equalsIgnoreCase("door")){
            return new DoorBuilderRobot();
        } else if (action.equalsIgnoreCase("frame")){
            return new FrameBuilderRobot();
        } else if (action.equalsIgnoreCase("wiring")){
            return new WiringBuilderRobot();
        } else if (action.equalsIgnoreCase("tester")){
            return new TesterRobot();
        }

        return null;
    }
}
