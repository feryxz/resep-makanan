package com.feryxz.resepmakanan.model;

import java.io.Serializable;

/**
 * Created by Feryxz Dev on 24/05/2020.
 */

public class DataModel implements Serializable{

    Integer viewType;
    String judul, konten;

    public Integer getViewType() {
        return viewType;
    }

    public void setViewType(Integer viewType) {
        this.viewType = viewType;
    }

    public String getJudul() {
        return judul;
    }

    public String getKonten() {
        return konten;
    }

    public void setKonten(String konten) {
        this.konten = konten;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }
}
