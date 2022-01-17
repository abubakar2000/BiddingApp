package com.solutionave.biddingapp.main.HomeActRV;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.solutionave.biddingapp.R;
import com.solutionave.biddingapp.models.ProductForRV;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import java.util.Date;

public class HomeRVAdaptor extends RecyclerView.Adapter<HomeRVAdaptor.ViewHolder> {
    public ArrayList<ProductForRV> list;

    public HomeRVAdaptor(ArrayList<ProductForRV> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public HomeRVAdaptor.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.product_layout_for_home_rv,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull HomeRVAdaptor.ViewHolder holder, int position) {
        holder.setDataWithoutDate(list.get(position).getImage(),list.get(position).getTitle(),list.get(position).getPrice());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView product_image;
        private TextView product_order_title;
        private TextView product_order_price;
        private TextView product_date_posted;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.product_date_posted = itemView.findViewById(R.id.product_date_posted);
            this.product_image = itemView.findViewById(R.id.product_image);
            this.product_order_price = itemView.findViewById(R.id.product_demand_price);
            this.product_order_title = itemView.findViewById(R.id.product_order_title);
        }
        public void setDataWithoutDate(String image_path, String order_title, int order_price){
// TODO set image bitmap
            //            this.product_image.setImageBitmap(); "dd:MM:yy"
            this.product_order_title.setText(order_title);
            this.product_order_price.setText(String.valueOf(order_price));

            Date date = new Date();
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy @HH:mm");
            this.product_date_posted.setText(df.format(date));
        }

        public void setData(String image_path, String order_title, int order_price, Date order_postedDate){
// TODO set image bitmap
            //            this.product_image.setImageBitmap(); "dd:MM:yy"
            this.product_order_title.setText(order_title);
            this.product_order_price.setText(order_price);

            Date date = new Date();

            this.product_date_posted.setText(order_postedDate.toString());
        }
    }
}
