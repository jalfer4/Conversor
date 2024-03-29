package com.programacionparadispositivosmoviles.conversor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private  static  final float precioDolarPeso = 55.93f;
    private  static  final float precioDolarEuro = 0.91f;
    private  static  final float precioEuroPeso = 61.72f;
    private  static  final float precioEuroDolar = 1.10f;
    private EditText iDolar;
    private EditText iEuro;
    private EditText iResultado;
    private RadioGroup iRadioGroup;
    private TextView itvCambioA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convertirMoneda(View v){

        iDolar = (EditText) findViewById(R.id.etDolares) ;
        iEuro = (EditText) findViewById(R.id.etEuros) ;
        iResultado = (EditText) findViewById(R.id.evTotal) ;
        iRadioGroup = (RadioGroup) findViewById(R.id.rgDolarEuro) ;
        itvCambioA = (TextView) findViewById(R.id.tvCambioA) ;

        String iDolarText =  iDolar.getText().toString() ;
        String iEuroText =  iEuro.getText().toString() ;

        float calculo;
        switch (iRadioGroup.getCheckedRadioButtonId()) {
            case R.id.rbDolar:
                if ((iDolarText.isEmpty() && iEuroText.isEmpty()) || (iEuroText.equals(".")) || (iDolarText.equals(".")) ){
                    Toast.makeText(this,"Debe ingresar algun valor de Dolar o Euro",Toast.LENGTH_LONG).show();

                }else
                {
                    if (iDolarText.isEmpty()){

                        calculo = Float.valueOf(iEuroText)  * precioEuroDolar;
                        iResultado.setText( String.valueOf(calculo) );
                        itvCambioA.setText("Cambio a " + String.valueOf(precioEuroDolar));

                    }else{
                    calculo = Float.valueOf(iDolarText);
                    iResultado.setText( String.valueOf(calculo) );
                    itvCambioA.setText("Cambio a 1");
                    }
                }

                break;
            case R.id.rbEuro:

                if ((iDolarText.isEmpty() && iEuroText.isEmpty()) || (iEuroText.equals(".")) || (iDolarText.equals("."))){
                    Toast.makeText(this,"Debe ingresar algun valor de Dolar o Euro",Toast.LENGTH_LONG).show();
                }else{
                if (iDolarText.isEmpty()){

                    calculo = Float.valueOf(iEuroText);
                    iResultado.setText( String.valueOf(calculo) );
                    itvCambioA.setText("Cambio a 1" );

                }else
                {
                        calculo = Float.valueOf(iDolarText)  * precioDolarEuro;
                        iResultado.setText( String.valueOf(calculo) );
                        itvCambioA.setText("Cambio a " + String.valueOf(precioDolarEuro));
                }}
                break;
            case R.id.rbPeso:

                if ((iDolarText.isEmpty() && iEuroText.isEmpty())  || (iEuroText.equals(".")) || (iDolarText.equals("."))){
                    Toast.makeText(this,"Debe ingresar algun valor de Dolar o Euro",Toast.LENGTH_LONG).show();



                }else {
                    if (iDolarText.isEmpty()) {

                        calculo = Float.valueOf(iEuroText) * precioEuroPeso;
                        iResultado.setText(String.valueOf(calculo));
                        itvCambioA.setText("Cambio a " + String.valueOf(precioEuroPeso));

                    } else {

                            calculo = Float.valueOf(iDolarText) * precioDolarPeso;
                            iResultado.setText(String.valueOf(calculo));
                            itvCambioA.setText("Cambio a " + String.valueOf(precioDolarPeso));
 }
                }
                break;

            case R.id.rbEuroPeso:

                if ((iDolarText.isEmpty() && iEuroText.isEmpty())  || (iEuroText.equals(".")) || (iDolarText.equals("."))){
                    Toast.makeText(this,"Debe ingresar algun valor de Dolar o Euro",Toast.LENGTH_LONG).show();



                }else {
                    if (iDolarText.isEmpty()) {

                        calculo = Float.valueOf(iEuroText) * precioEuroPeso;
                        iResultado.setText(String.valueOf(calculo));
                        itvCambioA.setText("Cambio a " + String.valueOf(precioEuroPeso));

                    } else {

                        calculo = Float.valueOf(iDolarText) * precioDolarPeso;
                        iResultado.setText(String.valueOf(calculo));
                        itvCambioA.setText("Cambio a " + String.valueOf(precioDolarPeso));
                    }
                }
                break;

            default:
                Toast.makeText(this,"Debe seleccionar una moneda de cambio",Toast.LENGTH_LONG).show();
                   }





    }

    public void activarDolar(View v){

        iDolar = (EditText) findViewById(R.id.etDolares) ;
        iEuro = (EditText) findViewById(R.id.etEuros) ;
        iEuro.setText("");
        iEuro.setEnabled(false);
        iDolar.setEnabled(true);
    }

    public void activarEuro(View v){

        iEuro = (EditText) findViewById(R.id.etEuros) ;
        iDolar = (EditText) findViewById(R.id.etDolares) ;
        iDolar.setText("");
        iEuro.setEnabled(true);
        iDolar.setEnabled(false);
    }

}
