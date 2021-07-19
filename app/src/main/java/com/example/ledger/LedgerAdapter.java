package com.example.ledger;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

public class LedgerAdapter extends RecyclerView.Adapter<LedgerAdapter.ViewHolder>{

    MyData[] myData;
    Context context;

    public LedgerAdapter(MyData[] myData, MainActivity activity) {
        this.myData = myData;
        this.context = activity;

    }


    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.card_view_list, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NotNull ViewHolder holder, int position) {
    final MyData myDataList = myData[position];
        holder.nameTxt.setText(myDataList.getName());
        holder.designationTxt.setText(myDataList.getDesignation());
        holder.addressTxt.setText(myDataList.getLocation());
        holder.profileImg.setImageResource(myDataList.getImage());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, myDataList.getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return myData.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView profileImg;
        TextView nameTxt;
        TextView designationTxt;
        TextView addressTxt;

        public ViewHolder( @NotNull View itemView) {
            super(itemView);

            nameTxt = itemView.findViewById(R.id.nameText);
            designationTxt = itemView.findViewById(R.id.designation);
            addressTxt = itemView.findViewById(R.id.address);
            profileImg = itemView.findViewById(R.id.profileImg);
        }
    }
}
