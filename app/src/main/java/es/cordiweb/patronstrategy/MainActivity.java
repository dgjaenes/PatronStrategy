package es.cordiweb.patronstrategy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public PrecioSimple precioSimple = PrecioSimple.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        precioSimple.setPrecio(2.5f);


        Button pagarenefectico = (Button) findViewById(R.id.action_cash);
        Button pagarcobtarjeta = (Button) findViewById(R.id.action_card);
        Button pagarconcupon = (Button) findViewById(R.id.action_coupon);

        pagarenefectico.setOnClickListener(this);
        pagarcobtarjeta.setOnClickListener(this);
        pagarconcupon.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Pago p;
        switch (v.getId()){
            case R.id.action_card:
                p = new Pago(new Tarjeta());
                break;

            case R.id.action_coupon:
                p = new Pago(new CuponDescuento());
                break;

            case R.id.action_cash:

            default:
                p = new Pago(new Efectivo());
                break;
        }


        String preciofinal = new StringBuilder()
                .append("Precio final: ")
                .append(p.empleodeStrategy(precioSimple.getPrecio()))
                .append(" €")
                .toString();

        Toast t = Toast.makeText(this, preciofinal, Toast.LENGTH_LONG);
        t.show();

    }

}
