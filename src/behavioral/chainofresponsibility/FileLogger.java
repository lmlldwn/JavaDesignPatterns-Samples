package behavioral.chainofresponsibility;

public class FileLogger extends LoggerAbstract{
    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message){
        System.out.println("Standard File::Logger: " + message);
    }

}
