package es.cordiweb.patronstrategy;

/**
 * Created by DAVID on 08/11/2017.
 */

class PrecioSimple {
    private static final PrecioSimple precioSimple = new PrecioSimple();

    private float precio;

    static PrecioSimple getInstance() {
        return precioSimple;
    }

    private PrecioSimple() {
    }

    public float getPrecio(){
        return precio;
    }
    protected void setPrecio(float f){
        precio = f;
    }
}
