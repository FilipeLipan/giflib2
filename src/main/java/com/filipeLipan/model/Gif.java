package com.filipeLipan.model;

import java.time.LocalDate;

/**
 * Created by lispa on 02/11/2016.
 */
public class Gif {
    private String name;

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    private int categoryId;
    private LocalDate date;
    private String user;
    private boolean favorite;

    public Gif(String name, int categoryId , LocalDate date, String user, boolean favorite) {
        this.name = name;
        this.categoryId = categoryId;
        this.date = date;
        this.user = user;
        this.favorite = favorite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }
}
