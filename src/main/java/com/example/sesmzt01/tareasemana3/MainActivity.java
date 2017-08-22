package com.example.sesmzt01.tareasemana3;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<ListaMascotas> mascotas;
    private RecyclerView recyclerView;
    MascotaAdaptador adaptador;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        recyclerView = (RecyclerView)findViewById(R.id.rvMain);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        InicializarLista();
        adaptador = new MascotaAdaptador(this,mascotas);
        recyclerView.setAdapter(adaptador);
    }

    public void InicializarLista(){

        mascotas = new ArrayList<ListaMascotas>();
        mascotas.add(new ListaMascotas(R.drawable.perro,"Nombre 1", "3"));
        mascotas.add(new ListaMascotas(R.drawable.perro2,"Nombre 2", "5"));
        mascotas.add(new ListaMascotas(R.drawable.perro3,"Nombre 3","2"));
        mascotas.add(new ListaMascotas(R.drawable.perro4,"Nombre 4","1"));
        mascotas.add(new ListaMascotas(R.drawable.perro5,"Nombre 5","4"));
    }



}


