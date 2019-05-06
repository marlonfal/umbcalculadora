package umb.calculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // operaciones
    Button btnDividir;
    Button btnMultiplicar;
    Button btnSumar;
    Button btnRestar;

    // acciones
    Button btnIgual;
    Button btnBorrar;

    // números
    Button btnCero;
    Button btnUno;
    Button btnDos;
    Button btnTres;
    Button btnCuatro;
    Button btnCinco;
    Button btnSeis;
    Button btnSiete;
    Button btnOcho;
    Button btnNueve;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDividir = findViewById(R.id.btnDividir);
        btnMultiplicar = findViewById(R.id.btnMultiplicar);
        btnSumar = findViewById(R.id.btnSumar);
        btnRestar = findViewById(R.id.btnRestar);

        btnIgual = findViewById(R.id.btnIgual);
        btnBorrar = findViewById(R.id.btnBorrar);

        btnCero = findViewById(R.id.btnCero);
        btnUno = findViewById(R.id.btnUno);
        btnDos = findViewById(R.id.btnDos);
        btnTres = findViewById(R.id.btnTres);
        btnCuatro = findViewById(R.id.btnCuatro);
        btnCinco = findViewById(R.id.btnCinco);
        btnSeis = findViewById(R.id.btnSeis);
        btnSiete = findViewById(R.id.btnSiete);
        btnDos = findViewById(R.id.btnDos);
        btnOcho = findViewById(R.id.btnOcho);
        btnNueve = findViewById(R.id.btnNueve);
    }
}
