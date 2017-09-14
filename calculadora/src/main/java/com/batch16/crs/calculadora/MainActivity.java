package com.batch16.crs.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

  //  boolean btn_decimal = false;
//boolean btn_igual = false;
   // boolean btn_sumar = false;
    //boolean btn_restar = false;
  //  boolean btn_multiplicar = false;
//    boolean btn_dividir = false;

    Double numero;
    Double resultado;

    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btndeciimal, btnsumar, btnrestar, btnmul, btndiv, btnigual;

    TextView tvCifra, tvResultado;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         tvCifra= (TextView) findViewById(R.id.tv_cifra);
         tvResultado = (TextView) findViewById(R.id.tv_resultado);


        btn0 = (Button) findViewById(R.id.btn_0);
        btn1 = (Button) findViewById(R.id.btn_1);
        btn2 = (Button) findViewById(R.id.btn_2);
        btn3 = (Button) findViewById(R.id.btn_3);
        btn4 = (Button) findViewById(R.id.btn_4);
        btn5 = (Button) findViewById(R.id.btn_5);
        btn6 = (Button) findViewById(R.id.btn_6);
        btn7 = (Button) findViewById(R.id.btn_7);
        btn8 = (Button) findViewById(R.id.btn_8);
        btn9 = (Button) findViewById(R.id.btn_9);
        btndeciimal = (Button) findViewById(R.id.btn_decimal);
        btnigual = (Button) findViewById(R.id.btn_igual);
        btnsumar = (Button) findViewById(R.id.btn_sumar);
        btnrestar = (Button) findViewById(R.id.btn_restar);
        btnmul = (Button) findViewById(R.id.btn_multipilcar);
        btndiv = (Button) findViewById(R.id.btn_division);



        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btndeciimal.setOnClickListener(this);
        btnigual.setOnClickListener(this);
        btnsumar.setOnClickListener(this);
        btnrestar.setOnClickListener(this);
        btnmul.setOnClickListener(this);
        btndiv.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {


        String datosReg = tvCifra.getText().toString();



        switch (view.getId()){
            case  R.id.btn_0:
                tvCifra.setText(datosReg+"0");
                break;
            case  R.id.btn_1:
                tvCifra.setText(datosReg+"1");
                break;
            case  R.id.btn_2:
                tvCifra.setText(datosReg+"2");
                break;
            case  R.id.btn_3:
                tvCifra.setText(datosReg+"3");
                break;
            case  R.id.btn_4:
                tvCifra.setText(datosReg+"4");
                break;
            case  R.id.btn_5:
                tvCifra.setText(datosReg+"5");
                break;
            case  R.id.btn_6:
                tvCifra.setText(datosReg+"6");
                break;
            case  R.id.btn_7:
                tvCifra.setText(datosReg+"7");
                break;
            case  R.id.btn_8:
                tvCifra.setText(datosReg+"8");
                break;
            case  R.id.btn_9:
                tvCifra.setText(datosReg+"9");
                break;
            case  R.id.btn_decimal:

                tvCifra.setText(datosReg + ".");
                break;
            case R.id.btn_restar:

                tvCifra.setText(datosReg +"-");

                break;
            case R.id.btn_sumar:

                tvCifra.setText(datosReg + "+");

                break;
            case R.id.btn_multipilcar:

                tvCifra.setText(datosReg + "x");

                break;
            case R.id.btn_division:

                tvCifra.setText(datosReg + "/");

                break;
            case R.id.btn_igual:




                tvResultado.setText(datosReg);
                break;

                }


        }
    }

