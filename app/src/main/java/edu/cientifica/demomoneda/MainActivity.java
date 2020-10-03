package edu.cientifica.demomoneda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etInicial;
    Button btnProcesar;
    TextView tvFinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etInicial = (EditText) findViewById(R.id.etMontoInicial);
        tvFinal = (TextView) findViewById(R.id.tvMontoFinal);
    }

    public void procesar(View view) {
        double montoinicial = Double.parseDouble(etInicial.getText().toString());
        double montoFinal = montoinicial / 3.6;
        tvFinal.setText(String.valueOf(montoFinal));
    }
}