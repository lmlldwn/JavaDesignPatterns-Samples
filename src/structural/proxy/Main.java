package structural.proxy;

import structural.proxy.hide.Database;
import structural.proxy.hide.DatabaseProxy;

public class Main {
    public static void main(String[] args){
        Database database = new DatabaseProxy();
        database.insertSMS("Test");
    }
}
