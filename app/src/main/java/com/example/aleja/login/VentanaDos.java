package com.example.aleja.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class VentanaDos extends AppCompatActivity {
    TextView txtNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana_dos);
        txtNombre = (TextView)findViewById(R.id.txtNombre2);
        txtNombre.setText("Bienvenido "+getIntent().getStringExtra("Usuario"));
    }
    public void pulsarSalir(View v)
    {
        finish();
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}
