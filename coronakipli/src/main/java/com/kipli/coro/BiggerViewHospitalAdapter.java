package com.kipli.coro;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class BiggerViewHospitalAdapter extends RecyclerView.Adapter<BiggerViewHospitalAdapter.CardViewHolder> {
    private ArrayList<Hospital> listHospital;

public BiggerViewHospitalAdapter(ArrayList<Hospital> list){
    this.listHospital = list;
}


    @NonNull
    @Override
    public BiggerViewHospitalAdapter.CardViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_bigger,viewGroup,false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewHolder holder, int position) {
        Hospital hospital = listHospital.get(position);

        Glide.with(holder.itemView.getContext())
                .load(hospital.getPhoto())
                .apply(new RequestOptions().override(350,550))
                .into(holder.imgPhoto);

        holder.tvName.setText(hospital.getName());
        holder.tvDetail.setText(hospital.getDetail());

//onclickButton
//        holder.btnFavorite.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(holder.itemView.getContext(), "Favorite " +
//                        listDokter.get(holder.getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();
//            }
//        });
//        holder.btnShare.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(holder.itemView.getContext(), "Share " +
//                        listDokter.get(holder.getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return listHospital.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {
ImageView imgPhoto;
TextView tvName,tvDetail;
Button btnFavorite, btnShare;
        public CardViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }
    }
}
