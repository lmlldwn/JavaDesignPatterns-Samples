package behavioral.chainofresponsibility;


public class Main {

    private static LoggerAbstract getChainofLoggers(){
        LoggerAbstract errorLogger = new ErrorLogger(LoggerAbstract.ERROR);
        LoggerAbstract fileLogger = new FileLogger(LoggerAbstract.DEBUG);
        LoggerAbstract consoleLogger = new ConsoleLogger(LoggerAbstract.INFO);
        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }

    public static void main(String[] args){
        LoggerAbstract loggerChain = getChainofLoggers();
        System.out.println("======");
        loggerChain.logMessage(LoggerAbstract.INFO,"This is an information");

        System.out.println("======");
        loggerChain.logMessage(LoggerAbstract.DEBUG,"This is a debug level information");

        System.out.println("======");
        loggerChain.logMessage(LoggerAbstract.ERROR,"This is an error information");
    }

}
