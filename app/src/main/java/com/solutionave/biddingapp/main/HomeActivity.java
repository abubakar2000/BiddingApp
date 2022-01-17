package com.solutionave.biddingapp.main;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import com.solutionave.biddingapp.R;
import com.solutionave.biddingapp.main.HomeActRV.HomeRVAdaptor;
import com.solutionave.biddingapp.models.ProductForRV;
import com.solutionave.biddingapp.models.PromotionBannerModel;
import com.solutionave.biddingapp.main.PromotionBannerRV.PromotionBannerRVAdaptor;

import java.util.ArrayList;
import java.util.Date;

public class HomeActivity extends AppCompatActivity {
    public ArrayList<PromotionBannerModel> promo_clients;
    public ArrayList<ProductForRV> products_list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        promo_clients = new ArrayList<PromotionBannerModel>();
        products_list = new ArrayList<ProductForRV>();
        LinearLayoutManager layout_upper_rv = new LinearLayoutManager(HomeActivity.this,RecyclerView.HORIZONTAL,false);
        RecyclerView promotional_banner_rv = findViewById(R.id.promotion_banner_rv);
        promotional_banner_rv.setLayoutManager(layout_upper_rv);
        LinearLayoutManager layout_below_upper_rv = new LinearLayoutManager(HomeActivity.this,LinearLayoutManager.VERTICAL,false);
        RecyclerView product_rv = findViewById(R.id.products_rv);
        product_rv.setLayoutManager(layout_below_upper_rv);
//        add all the promo clients here which will appear on home screen
        promo_clients.add(new PromotionBannerModel("","Client 10"));
        promo_clients.add(new PromotionBannerModel("","Client 2"));
        promo_clients.add(new PromotionBannerModel("","Client 3"));
        promo_clients.add(new PromotionBannerModel("","Client 4"));
        PromotionBannerRVAdaptor promo_adaptor = new PromotionBannerRVAdaptor(this.promo_clients);
        promotional_banner_rv.setAdapter(promo_adaptor);

//    add all products here
        Date date = new Date();
        products_list.add(new ProductForRV("Prd 1",12,"","some decsc1",false,date,"sialkot","123"));
        products_list.add(new ProductForRV("Prd 2",22,"","some decsc2",false,date,"sialkot","123"));
        products_list.add(new ProductForRV("Prd 3",32,"","some decsc3",false,date,"sialkot","123"));
        products_list.add(new ProductForRV("Prd 4",42,"","some decsc4",false,date,"sialkot","123"));
        HomeRVAdaptor product_adaptor = new HomeRVAdaptor(this.products_list);
        product_rv.setAdapter(product_adaptor);

    }
}