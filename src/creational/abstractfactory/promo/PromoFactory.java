package creational.abstractfactory.promo;

public class PromoFactory {

    public static Promo getPromo(String promo){
        if(promo == null){
            return null;
        }

        if (promo.equalsIgnoreCase("bundle")){
            return new PromoBundle();
        } else if (promo.equalsIgnoreCase("discount")){
            return new PromoDiscount();
        } else if (promo.equalsIgnoreCase("raffle")){
            return new PromoRaffle();
        }

        return null;
    }
}
