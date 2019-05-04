package umb.calculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnSumar;
    private Button btnRestar;
    private Button btnMultiplicar;
    private Button btnDividir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnSumar = findViewById(R.id.btnSumar);
        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivitySumar();
            }
        });

        btnRestar = findViewById(R.id.btnRestar);
        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityRestar();
            }
        });

        btnMultiplicar = findViewById(R.id.btnMultiplicar);
        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityMultiplicar();
            }
        });

        btnDividir = findViewById(R.id.btnDividir);
        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityDividir();
            }
        });
    }

    public void openActivitySumar() {
        Intent intent = new Intent(this, SumarActivity.class);
        startActivity(intent);
    }

    public void openActivityRestar() {
        Intent intent = new Intent(this, RestarActivity.class);
        startActivity(intent);
    }

    public void openActivityMultiplicar() {
        Intent intent = new Intent(this, MultiplicarActivity.class);
        startActivity(intent);
    }

    public void openActivityDividir() {
        Intent intent = new Intent(this, DividirActivity.class);
        startActivity(intent);
    }
}
