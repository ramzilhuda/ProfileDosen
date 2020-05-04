package com.example.profiledosen;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyHolder extends RecyclerView.ViewHolder {

    ImageView mimageView;
    TextView mTittle, mDescripton;

    public MyHolder(@NonNull View itemView) {
        super(itemView);

        this.mimageView = itemView.findViewById(R.id.imgView);
        this.mTittle = itemView.findViewById(R.id.tvTittle);
        this.mDescripton = itemView.findViewById(R.id.tvDescription);
    }
}
