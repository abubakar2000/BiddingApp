package com.solutionave.biddingapp.models;

import java.util.Date;

public class ProductForRV {
    private String Title;
    private int Price;
    private String Image;
    private String Description;
    private boolean Featured;
    private Date PostedOn;
    private String Location;
    private String contact;

    public ProductForRV(String title, int price, String image, String description, boolean featured, Date postedOn, String location, String contact) {
        Title = title;
        Price = price;
        Image = image;
        Description = description;
        Featured = featured;
        PostedOn = postedOn;
        Location = location;
        this.contact = contact;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public boolean isFeatured() {
        return Featured;
    }

    public void setFeatured(boolean featured) {
        Featured = featured;
    }

    public Date getPostedOn() {
        return PostedOn;
    }

    public void setPostedOn(Date postedOn) {
        PostedOn = postedOn;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }
}
