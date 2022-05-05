package behavioral.chainofresponsibility;

public class ErrorLogger extends LoggerAbstract{
    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message){
        System.out.println("Standard Error::Logger: " + message);
    }
}
