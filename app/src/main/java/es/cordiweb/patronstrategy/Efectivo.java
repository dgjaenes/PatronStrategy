package es.cordiweb.patronstrategy;

public class Efectivo implements Strategy{

    @Override
    public String procesodePago(float price) {
        return String.format("%.2f", price);
    }
}
