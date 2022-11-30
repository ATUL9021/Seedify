package com.example.mydemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class AllSeedsAdapter  extends RecyclerView.Adapter<AllSeedsAdapter.ViewHolder> {
    Context context;
    ArrayList<AllSeedsModel> list;
    ArrayList<AllSeedsModel> listFull;
    public AllSeedsAdapter(Context context, ArrayList<AllSeedsModel> list){
        this.context=context;
        this.list=list;
        this.listFull=list;
        this.list=new ArrayList<>(listFull);
    }
    public void setFilterList(@NonNull ArrayList<AllSeedsModel> filterList){
        this.list=filterList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.recyler_all_seeds,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        AllSeedsModel model = list.get(position);
        holder.seedImage.setImageResource(model.getSeedImage());
        holder.seedName.setText(model.getSeedName());
        holder.seedTemperature.setText(model.getSeedTemperature());
        holder.seedGerminationTime.setText(model.getSeedGerminationTime());
        holder.seedStates.setText(model.getSeedStates());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }



    public static class  ViewHolder extends RecyclerView.ViewHolder{
        ImageView seedImage;
        TextView seedName,seedTemperature,seedGerminationTime,seedStates;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            seedImage=itemView.findViewById(R.id.seedImage);
            seedName=itemView.findViewById(R.id.seedName);
            seedTemperature=itemView.findViewById(R.id.seedTemperature);
            seedGerminationTime=itemView.findViewById(R.id.seedGerminationTime);
            seedStates=itemView.findViewById(R.id.seedStates);
        }
    }
}
