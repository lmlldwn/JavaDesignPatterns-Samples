package creational.abstractfactory;

public class PromoCreatorFactory {
    public static CompanyPromo getPromo(String choice){
        if(choice.equalsIgnoreCase("jollibee")){
            return new JollibeePromo();
        }else if(choice.equalsIgnoreCase("mcdonald")){
            return new McDonaldPromo();
        }
        return null;
    }
}
