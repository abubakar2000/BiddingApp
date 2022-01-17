package com.solutionave.biddingapp.models;

public class PromotionBannerModel {
    private String promotional_image;

    public String getPromotional_image() {
        return promotional_image;
    }

    public void setPromotional_image(String promotional_image) {
        this.promotional_image = promotional_image;
    }

    public String getPromotional_text() {
        return promotional_text;
    }

    public void setPromotional_text(String promotional_text) {
        this.promotional_text = promotional_text;
    }

    private String promotional_text;

    public PromotionBannerModel(String promotional_image, String promotional_text) {
        this.promotional_image = promotional_image;
        this.promotional_text = promotional_text;
    }
}
