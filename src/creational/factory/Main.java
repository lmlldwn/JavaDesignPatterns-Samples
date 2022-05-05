package creational.factory;
//used when you don't know what the data type of an instance should be
public class Main {
    public static void main(String[] args){
        RobotFactory robotFactory = new RobotFactory();

        Robot robot = robotFactory.getRobot("frame");
        robot.doTask();
    }
}
