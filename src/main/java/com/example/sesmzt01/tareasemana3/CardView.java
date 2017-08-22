package com.example.sesmzt01.tareasemana3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CardView extends AppCompatActivity {

    private ImageView ivFoto;
    private TextView  tvNombre;
    private TextView  tvCalificacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view);

        ivFoto = (ImageView)findViewById(R.id.imvMascota);
        tvNombre = (TextView)findViewById(R.id.tvNombrePerro);
        tvCalificacion = (TextView)findViewById(R.id.tvCalificaionPerro);

    }
}
