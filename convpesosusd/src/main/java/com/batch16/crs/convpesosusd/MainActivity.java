package com.batch16.crs.convpesosusd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.R.attr.name;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText edPesos;
    EditText edUsd;
    Button btnPesos;
    Button btnUsd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edPesos = (EditText) findViewById(R.id.ed_pesos);
        edUsd = (EditText) findViewById(R.id.ed_usd);
        btnPesos = (Button) findViewById(R.id.btn_pesos);
        btnUsd = (Button) findViewById(R.id.btn_usd);

        btnPesos.setOnClickListener(this);
        btnUsd.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        String pesos = edPesos.getText().toString();
        String usd = edUsd.getText().toString();


        switch (view.getId()) {


            case R.id.btn_pesos:


                if (usd.isEmpty()) {
                    Toast.makeText(this, "Ingresa un valor", Toast.LENGTH_LONG).show();

                } else {

                    int total = Integer.parseInt(usd) * 18;

                    Toast.makeText(this, "Tu cambio es " + total, Toast.LENGTH_LONG).show();
                    edPesos.setText("Tu cambio en pesos es $" + total);

                }
                break;

            case R.id.btn_usd:

                if (pesos.isEmpty()) {
                    Toast.makeText(this, "Ingresa un valor", Toast.LENGTH_LONG).show();

                } else {
                    int totalUsd = Integer.parseInt(pesos) / 18;

                    Toast.makeText(this, "Tu cambio es  " + totalUsd, Toast.LENGTH_LONG).show();

                    edUsd.setText("Tu cambio en usd es " + totalUsd );
                }

                    break;

                }


        }
    }
