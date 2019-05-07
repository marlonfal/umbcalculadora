package umb.calculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // operaciones
    Button btnDividir,  btnMultiplicar, btnSumar, btnRestar;

    // acciones
    Button btnIgual, btnBorrar;

    // números
    Button btnCero, btnUno, btnDos, btnTres, btnCuatro;
    Button btnCinco, btnSeis, btnSiete, btnOcho, btnNueve;
    // tv, tv2
    TextView txtAOperar, txtResultado;

    // vars
    int resultado, operando1 = 0, operando2 = 0;
    //
    String operacionPrevia = "+";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDividir = findViewById(R.id.btnDividir);
        btnDividir.setOnClickListener(this);

        btnMultiplicar = findViewById(R.id.btnMultiplicar);
        btnMultiplicar.setOnClickListener(this);

        btnSumar = findViewById(R.id.btnSumar);
        btnSumar.setOnClickListener(this);

        btnRestar = findViewById(R.id.btnRestar);
        btnRestar.setOnClickListener(this);

        btnIgual = findViewById(R.id.btnIgual);
        btnIgual.setOnClickListener(this);

        btnBorrar = findViewById(R.id.btnBorrar);
        btnBorrar.setOnClickListener(this);

        btnCero = findViewById(R.id.btnCero);
        btnCero.setOnClickListener(this);

        btnUno = findViewById(R.id.btnUno);
        btnUno.setOnClickListener(this);

        btnDos = findViewById(R.id.btnDos);
        btnDos.setOnClickListener(this);

        btnTres = findViewById(R.id.btnTres);
        btnTres.setOnClickListener(this);

        btnCuatro = findViewById(R.id.btnCuatro);
        btnCuatro.setOnClickListener(this);

        btnCinco = findViewById(R.id.btnCinco);
        btnCinco.setOnClickListener(this);

        btnSeis = findViewById(R.id.btnSeis);
        btnSeis.setOnClickListener(this);

        btnSiete = findViewById(R.id.btnSiete);
        btnSiete.setOnClickListener(this);

        btnDos = findViewById(R.id.btnDos);
        btnDos.setOnClickListener(this);

        btnOcho = findViewById(R.id.btnOcho);
        btnOcho.setOnClickListener(this);

        btnNueve = findViewById(R.id.btnNueve);
        btnNueve.setOnClickListener(this);

        txtAOperar = findViewById(R.id.txtAOperar);
        txtResultado = findViewById(R.id.txtResultado);
    }


    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.btnCero:
                txtAOperar.append("0");
                break;
            case R.id.btnUno:
                txtAOperar.append("1");
                break;
            case R.id.btnDos:
                txtAOperar.append("2");
                break;
            case R.id.btnTres:
                txtAOperar.append("3");
                break;
            case R.id.btnCuatro:
                txtAOperar.append("4");
                break;
            case R.id.btnCinco:
                txtAOperar.append("5");
                break;
            case R.id.btnSeis:
                txtAOperar.append("6");
                break;
            case R.id.btnSiete:
                txtAOperar.append("7");
                break;
            case R.id.btnOcho:
                txtAOperar.append("8");
                break;
            case R.id.btnNueve:
                txtAOperar.append("9");
                break;
            case R.id.btnBorrar:
                txtAOperar.setText("");
                txtResultado.setText("");
                operando1 = 0;
                operando2 = 0;
                resultado = 0;
                break;
            case R.id.btnSumar:
                operar("+");
                break;
            case R.id.btnRestar:
                operar("-");
                break;
            case R.id.btnDividir:
                operar("/");
                break;
            case R.id.btnMultiplicar:
                operar("*");
                break;
            case R.id.btnIgual:
                operar("=");
                break;

        }
    }

    public void operar(String operacion) {
        resultado = operando1;
        String aOperar = txtAOperar.getText().toString();
        try {
            if (!aOperar.isEmpty()) {
                operando2 = Integer.parseInt(aOperar);
                if (operacionPrevia == "+") resultado += operando2;
                if (operacionPrevia == "-") resultado -= operando2;
                if (operacionPrevia == "/") {
                    if (operando2 != 0) {
                        resultado /= operando2;
                    } else {
                        Toast.makeText(this, "No se puede dividir por cero", Toast.LENGTH_LONG).show();
                    }
                }
                if (operacionPrevia == "*") resultado *= operando2;
                operando1 = resultado;
                operacionPrevia = operacion;
                if (operacion == "=") {
                    txtAOperar.setText("" + resultado);
                    txtResultado.setText("" + resultado);
                } else {
                    txtAOperar.setText("");
                    txtResultado.setText("" + resultado + " " +  operacionPrevia);
                }
            } else {
                Toast.makeText(this, "Seleccione un número para operar", Toast.LENGTH_LONG).show();
            }
        } catch (NumberFormatException ex) {
            Toast.makeText(this, "Ocurrió un error al calcular el resultado", Toast.LENGTH_LONG).show();
        }
    }
}
