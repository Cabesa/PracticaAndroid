package com.example.aleja.practica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class Productos extends AppCompatActivity {

    private String lenguajeProgramacion[];
    private String descripciones[];
    private Integer[] imgid={
            R.drawable.java,
            R.drawable.php,
            R.drawable.python,
            R.drawable.javascript,
            R.drawable.ruby,
            R.drawable.c,
            R.drawable.go,
            R.drawable.perl,
            R.drawable.pascal
    };

    private ListView lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productos);
        lenguajeProgramacion=getResources().getStringArray(R.array.opcionesLista);
        descripciones=getResources().getStringArray(R.array.descripcionesLista);
        ListAdapterPractica adapter=new ListAdapterPractica(this,lenguajeProgramacion,descripciones,imgid);
        lista=(ListView)findViewById(R.id.mi_lista);
        lista.setAdapter(adapter);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Slecteditem= lenguajeProgramacion[+position];
                Toast.makeText(getApplicationContext(), Slecteditem, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
