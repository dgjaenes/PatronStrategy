package es.cordiweb.patronstrategy;

public class CuponDescuento implements Strategy{

    @Override
    public String procesodePago(float price) {
        return String.format("%.2f", price*0.9f);
    }
}
