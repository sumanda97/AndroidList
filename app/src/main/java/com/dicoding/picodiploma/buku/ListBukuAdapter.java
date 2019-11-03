package com.dicoding.picodiploma.buku;

import android.content.Context;
import android.content.Intent;
import android.telecom.Call;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListBukuAdapter extends RecyclerView.Adapter<ListBukuAdapter.ListViewHolder>{
    private ArrayList<Buku> listBuku;
    private OnItemClickCallback onItemClickCallback;


    void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    ListBukuAdapter(ArrayList<Buku> list) {
        this.listBuku = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_buku, viewGroup, false);
        return new ListViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Buku buku = listBuku.get(position);
        Glide.with(holder.itemView.getContext())
                .load(buku.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);

        holder.tvName.setText(buku.getName());
        holder.tvDetail.setText(buku.getDetail());

        final Context context = holder.itemView.getContext();
        Glide.with(holder.itemView.getContext())
                .load(buku.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(buku.getName());
        holder.tvDetail.setText(buku.getDetail());
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onItemClickCallback.onItemClicked(listBuku.get(holder.getAdapterPosition()));


                }
            });
        }


    @Override
    public int getItemCount() {
        return listBuku.size();
    }
    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;

        ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }


    }

    public interface OnItemClickCallback {
        void onItemClicked(Buku data);
    }
}