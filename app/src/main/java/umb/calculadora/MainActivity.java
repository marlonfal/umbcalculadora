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

    }
}
