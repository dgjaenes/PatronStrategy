package es.cordiweb.patronstrategy;

/**
 * Created by DAVID on 08/11/2017.
 */

public class Pago {
    private Strategy strategy;

    public Pago(Strategy s){
        this.strategy= s;
    }

    public String empleodeStrategy(float f){
        return this.strategy.procesodePago(f);
    }
}
