package com.example.recyclerviewjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclearView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(layoutManager);

        List<ModelClass> modelClassList = new ArrayList<>();
        modelClassList.add(new ModelClass(R.drawable.usuario1,"Alfredo Hammer","Programador"));
        modelClassList.add(new ModelClass(R.drawable.usuario2,"Osiel Ferrera","Programador Senior"));
        modelClassList.add(new ModelClass(R.drawable.usuario3,"Abner Williams","Especialista en Informatica"));
        modelClassList.add(new ModelClass(R.drawable.usuario4,"Carlos Patterson","Tecnico en Telefonia"));
        modelClassList.add(new ModelClass(R.drawable.usuario5,"Fernando Colomer","Seguridad Privada"));
        modelClassList.add(new ModelClass(R.drawable.usuario6,"Wilfredo Williams","Ingeniero en Sistemas"));
        modelClassList.add(new ModelClass(R.drawable.usuario7,"Mariana Zamora","Ayudante General"));
        modelClassList.add(new ModelClass(R.drawable.usuario8,"Maria Peralta","Ejecutiva de ventas"));
        modelClassList.add(new ModelClass(R.drawable.usuario9,"Dayana Ferrera ","Secretaria Ejecutiva"));
        modelClassList.add(new ModelClass(R.drawable.usuario10,"Juana Castellon","Limpieza General"));
        modelClassList.add(new ModelClass(R.drawable.usuario5,"Pedro Fernandez","Conserje General"));

        Adapter adapter = new Adapter(modelClassList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}