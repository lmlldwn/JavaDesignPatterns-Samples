package structural.proxy.hide;

public class DatabaseProxy implements Database {

    private Database db = new DatabaseMySQL();


    @Override
    public void insertSMS(String SMS){
        db.insertSMS("some sms");
        System.out.println("proxy inserting SMS");
    }


}
