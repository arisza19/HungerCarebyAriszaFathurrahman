package com.example.hungercarebyariszafathurrahman;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.DataViewHolder> {

    Context context;

    ArrayList<Data> list;

    public DataAdapter(Context context, ArrayList<Data> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public DataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_data,parent,false);
        return new DataViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull DataViewHolder holder, int position) {

        Data data = list.get(position);
        holder.itemNo.setText(data.getNo());
        holder.itemNat.setText(data.getNation());
        holder.itemIndex.setText(data.getIndex());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class DataViewHolder extends RecyclerView.ViewHolder{

        TextView itemNo, itemNat, itemIndex;

        public DataViewHolder(@NonNull View itemView) {
            super(itemView);

            itemNo = itemView.findViewById(R.id.itemNo);
            itemNat = itemView.findViewById(R.id.itemNat);
            itemIndex = itemView.findViewById(R.id.itemIndex);

        }
    }

}
