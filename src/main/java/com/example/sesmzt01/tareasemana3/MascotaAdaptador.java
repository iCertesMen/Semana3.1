package com.example.sesmzt01.tareasemana3;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by sesmzt01 on 20/08/2017.
 */

public class MascotaAdaptador extends RecyclerView.Adapter<MascotaAdaptador.ViewHolder> {

    Context context;
    ArrayList<ListaMascotas> mascotaLista;

    public MascotaAdaptador (Context context, ArrayList<ListaMascotas> mascotaLista){
        this.context = context;
        this.mascotaLista = mascotaLista;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_card_view,parent,false);
        ViewHolder viewHolder = new ViewHolder(itemView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.ivFoto.setImageResource(mascotaLista.get(position).getjFoto());
        holder.tvNombre.setText(mascotaLista.get(position).getjNombre());
        holder.tvCalificacion.setText(mascotaLista.get(position).getjCalificacion());

    }

    @Override
    public int getItemCount() {
        return mascotaLista.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView ivFoto;
        TextView tvNombre;
        TextView tvCalificacion;

        public ViewHolder(View itemView) {
            super(itemView);

            ivFoto = (ImageView) itemView.findViewById(R.id.imvMascota);
            tvNombre = (TextView) itemView.findViewById(R.id.tvNombrePerro);
            tvCalificacion = (TextView) itemView.findViewById(R.id.tvCalificaionPerro);
        }
    }
}


