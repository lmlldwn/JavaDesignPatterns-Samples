package creational.prototype;

import java.util.HashMap;

public class Main {
    private static HashMap<String, Organization> organizationCache = new HashMap<>();

    public static void main(String[] args){
        Organization org = new Community();
        org.setName("PADC");
        org.setId(1);
        org.setAddress("Philippines");

        organizationCache.put(org.getName(), org);

        org = new Company();
        org.setName("SeaOil");
        org.setId(1);
        org.setAddress("Philippines");

        organizationCache.put(org.getName(), org);
        Company company = (Company) organizationCache.get("SeaOil").clone();
    }
}
