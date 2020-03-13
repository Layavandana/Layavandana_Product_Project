package com.example.company;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{

    Context c;
    String s1[];
    public MyAdapter(Context contxt,String s[]){
        c = contxt;
        s1 = s;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from(c);
        View v = inflater.inflate(R.layout.my_row,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.text.setText(s1[position]);
    }

    @Override
    public int getItemCount() {
        return s1.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView text;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            text = (itemView).findViewById(R.id.text1);
        }
    }

}
