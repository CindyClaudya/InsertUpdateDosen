package com.e.uts_aplikasi_krs.admin;

import com.google.gson.annotations.SerializedName;

public class Dosen {

    @SerializedName("id")
    private int id;

    @SerializedName("nama")
    private int nama;

    @SerializedName("nidn")
    private int nidn;

    @SerializedName("alamat")
    private int alamat;

    @SerializedName("gelar")
    private int gelar;

    @SerializedName("foto")
    private int foto;


    public int getId() {
        return id;
    }

    public int getNidn() {
        return nidn;
    }

    public int getAlamat() {
        return alamat;
    }
    public int getGelar() {
        return gelar;
    }
    public int getNama() {
        return nama;
    }
    public int getFoto() {
        return foto;
    }
}

