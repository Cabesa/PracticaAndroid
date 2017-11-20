package com.example.aleja.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnEntrar;
    EditText txtUsuario;
    EditText txtPass;
    TextView lblFinal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarUI();
    }
    public void inicializarUI(){
        btnEntrar = (Button)findViewById(R.id.btnEntrar);
        txtUsuario = (EditText)findViewById(R.id.txtUsuario);
        txtPass = (EditText)findViewById(R.id.txtPass);
        lblFinal = (TextView)findViewById(R.id.lblFinal);

    }
    public void pulsarBoton(View v)
    {
        boolean ok = ((txtUsuario.getText().toString().equals("Prueba"))&&(txtPass.getText().toString().equals("Prueba")));
        int texto = ok ? R.string.acceso : R.string.denegado;
        int color = ok?R.color.verde:R.color.rojo;
        Toast.makeText(this,texto,Toast.LENGTH_SHORT).show();
        lblFinal.setText(texto);
        lblFinal.setTextColor(ContextCompat.getColor(getApplicationContext(), color));
        if(ok)
        {
            Intent intencion = new Intent(getApplicationContext(),VentanaDos.class);
            intencion.putExtra("Usuario",txtUsuario.getText());
            startActivity(intencion);
        }
    }
}
