package creational.abstractfactory;

import creational.abstractfactory.promo.Promo;
import creational.abstractfactory.promo.PromoFactory;

//use for unknown data type
//data type is declared at instance creation

public class Main {
    public static void main(String[] args){
        CompanyPromo companyPromo = PromoCreatorFactory.getPromo("jollibee");
        Promo promo = PromoFactory.getPromo("discount");
    }
}
