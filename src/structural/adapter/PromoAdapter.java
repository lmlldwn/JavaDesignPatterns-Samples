package structural.adapter;

public class PromoAdapter extends Promo implements PromoProcessing{

    private RawSMS rawSMS;

    public PromoAdapter(RawSMS rawSMS) {
        this.rawSMS = rawSMS;
    }

    @Override
    public void registerPromo(){
        //Lemuel, Garcia, March 30, 1999, Philippines
        this.setMessage(rawSMS.getMessage());
    }

    @Override
    public void drawPromo(){

    }


}
