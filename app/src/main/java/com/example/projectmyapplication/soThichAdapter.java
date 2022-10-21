package com.example.projectmyapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class soThichAdapter extends RecyclerView.Adapter<soThichAdapter.ViewHolder>{

    ArrayList<SoThich> tenSoThich;
    Context context;

    public soThichAdapter(ArrayList<SoThich> tenSoThich, Context context) {
        this.tenSoThich = tenSoThich;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater.inflate(R.layout.item_recycler,parent,false);

        return new ViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.textView.setText(tenSoThich.get(position).getSoThich());
        holder.imageView.setImageResource(tenSoThich.get(position).getHinhAnh());
    }

    @Override
    public int getItemCount() {
        return tenSoThich.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView textView;
        ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.textViewRow);
            imageView = (ImageView) itemView.findViewById(R.id.image_view);
        }
    }

}
