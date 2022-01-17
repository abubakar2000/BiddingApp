package com.solutionave.biddingapp.main.PromotionBannerRV;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.solutionave.biddingapp.R;
import com.solutionave.biddingapp.models.PromotionBannerModel;

import java.util.ArrayList;

public class PromotionBannerRVAdaptor extends RecyclerView.Adapter<PromotionBannerRVAdaptor.ViewHolder> {
    public ArrayList<PromotionBannerModel> list;

    public PromotionBannerRVAdaptor(ArrayList<PromotionBannerModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public PromotionBannerRVAdaptor.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.featured_ads_banner, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PromotionBannerRVAdaptor.ViewHolder holder, int position) {
        holder.setData(list.get(position).getPromotional_image(),list.get(position).getPromotional_text());
    }

    @Override
    public int getItemCount() {
        return this.list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView promotional_image;
        private TextView promotional_text;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            promotional_image = itemView.findViewById(R.id.promotional_image_ads);
            promotional_text = itemView.findViewById(R.id.promotion_text_ads);
        }

        public void setData(String Promo_imagePath, String Promo_text) {
            this.promotional_text.setText(Promo_text);
//    TODO set promotional images
            //            promotional_image.setImageBitmap();
        }
    }
}
