package com.batch16.crs.botones_toas;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnOk;
    TextView  userName;
    EditText edUserName;
    Button btnGuardar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edUserName = (EditText) findViewById(R.id.et_user_name);
        userName  = (TextView) findViewById(R.id.tv_user_name);
        btnOk = (Button) findViewById(R.id.enviar);
        btnGuardar = (Button) findViewById(R.id.btn_guardar);

        btnOk.setOnClickListener(this);
        btnGuardar.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        String name = edUserName.getText().toString();


        switch (view.getId()){


            case R.id.enviar:



            if (name.isEmpty()){
                Snackbar.make(view, "Ingresa un nombre", Snackbar.LENGTH_SHORT).show();
                Toast.makeText(this,"Ingresa un Nombre", Toast.LENGTH_SHORT).show();

            }
            else {
                Toast.makeText(this, "Hola " + name, Toast.LENGTH_SHORT).show();
                 }
            break;

            case R.id.btn_guardar:

                if (name.isEmpty()){
                    Snackbar.make(view, "Ingresa un nombre", Snackbar.LENGTH_SHORT).show();


                }
                else {
                    userName.setText("Usuario: " + name);
                }


                break;

        }




    }
}
