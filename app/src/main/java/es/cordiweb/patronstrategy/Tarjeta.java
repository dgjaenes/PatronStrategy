package es.cordiweb.patronstrategy;

public class Tarjeta implements Strategy{


    @Override
    public String procesodePago(float price) {
        return String.format("%.2f", price+0.5f);
    }
}
