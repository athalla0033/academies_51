package intifada.example.com.submission;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class CardViewWisataAdapter extends RecyclerView.Adapter<CardViewWisataAdapter.CardViewViewHolder>{
    private ArrayList<Wisata> listWisata;
    private CustomOnItemClickListener listener;

    /*private Button btnMoveWithDataActivity;*/

    public CardViewWisataAdapter(CustomOnItemClickListener listener) {
        this.listener=listener;
    }

    public ArrayList<Wisata> getListWisata() { return listWisata;}

    public void setListWisata(ArrayList<Wisata> listWisata) {
        this.listWisata = listWisata;
    }
    @Override
    public CardViewViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview_wisata, parent, false);
        CardViewViewHolder viewHolder = new CardViewViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CardViewViewHolder holder, final int position) {

        final Wisata p = getListWisata().get(position);

        Glide.with(holder.itemView.getContext())
                .load(p.getPhoto())
                .override(350, 550)
                .into(holder.imgPhoto);

        holder.tvName.setText(p.getName());
        holder.tvRemarks.setText(p.getRemarks());

        holder.btnDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onItemClicked(p, position);
            }
        });

        /*holder.btnUp.setOnClickListener(new CustomOnItemClickListener(position, new CustomOnItemClickListener.OnItemClickCallback() {

            @Override
            public void onItemClicked(View view, int position) {
                Intent moveIntent = new Intent(CardViewWisataAdapter.this, DetailsActivity.class);
                context.startActivity(moveIntent);
                Toast.makeText(context, "UP : "+getListWisata().get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        }));*/


    }

    @Override
    public int getItemCount() {
        return getListWisata().size();
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder{
        ImageView imgPhoto;
        TextView tvName, tvRemarks;
        Button  btnShare, btnDetail, btnUp;
        public CardViewViewHolder(View itemView) {
            super(itemView);
            imgPhoto = (ImageView)itemView.findViewById(R.id.img_item_photo);
            tvName = (TextView)itemView.findViewById(R.id.tv_item_name);
            tvRemarks = (TextView)itemView.findViewById(R.id.tv_item_remarks);
            btnShare = (Button)itemView.findViewById(R.id.btn_set_share);
            btnDetail = (Button)itemView.findViewById(R.id.btn_set_detail);
            /*btnUp = (Button)itemView.findViewById(R.id.btn_set_up);*/
        }
    }
}
