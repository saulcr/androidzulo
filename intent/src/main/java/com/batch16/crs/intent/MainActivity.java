package com.batch16.crs.intent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnOk, btnLink, btnllamada, btnstreetview,  btnescorgerapp, btnForResult, btntomarfoto;
    EditText usuario;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOk = (Button) findViewById(R.id.btn_ok);
        usuario = (EditText) findViewById(R.id.ed_usuario);
        btnLink = (Button) findViewById(R.id.btn_link);
        btnllamada = (Button) findViewById(R.id.btnllamada);
        btnstreetview = (Button) findViewById(R.id.btn_streetview);
        btnescorgerapp = (Button) findViewById(R.id.btn_escogerapp);
        btnForResult = (Button) findViewById(R.id.btn_forResult);
        btntomarfoto = (Button) findViewById(R.id.btn_foto)

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              String TextUsuario = usuario.getText().toString();
                Intent  intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra(Constantes.INTENT_KEY_USERNAME, TextUsuario);
                startActivity(intent);

            }
        });
        btnLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirlink();


            }

            private void abrirlink() {

            }
        });
        btnllamada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hacerllamada();

            }

            private void hacerllamada() {
            }
        });

        btnstreetview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrarStreetvieww();

            }

            private void mostrarStreetvieww() {
               // Uri gmm = uri.parse"google.streetview:cbll=19332273";
               // Intent intent = new Intent(Intent.ACTION_VIEW, gmm);
                //intent.setPack("com.google.android.app");


            }
        }) ;

        btnescorgerapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                escogeraap();
            }

            private void escogeraap() {
                String texto = "este es el texto que quieres mandar";

                Intent intent = new Intent(Intent.ACTION_SEND);

                intent.putExtra(Intent.EXTRA_TEXT, texto);
                intent.setType("text/plain");
                Intent chooser = Intent.createChooser(intent,"escoge una app");


                if(intent.resolveActivity(getPackageManager()) != null){
                    startActivity(chooser);


                }


            }
        });

        btnForResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String txt = usuario.getText().toString();

                if(txt.isEmpty()){

                    Toast.makeText(view.getContext(), "no", Toast.LENGTH_LONG).show();
                }else {

                    Intent intent = new Intent(view.getContext(),Main2Activity.class);
                    intent.putExtra(Constantes.INTENT_KEY_USERNAME, txt);
                    startActivityForResult(intent, 101);

                }

                }



        });


        }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (101 == requestCode){
            if (resultCode ==RESULT_OK){
                String resultText= data.getStringExtra("saludo");
                Toast.makeText(this, resultText, Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, "back", Toast.LENGTH_SHORT).show();
            }

        }

        btntomarfoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tomarfoto();
            }

            private void tomarfoto() {
                Intent intent =


            }
        });



        Log.e("Estoy en el metodo ", "onActivityResult" );
        Log.e("requestCode", requestCode + "");
        Log.e("resultCode", resultCode + "");

    }
}





