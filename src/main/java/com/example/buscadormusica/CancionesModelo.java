package com.example.buscadormusica;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CancionesModelo {
    public CancionesModelo(Integer id, String type, String title, String name) {
        this.id = id;
        this.type = type;
        this.title = title;
        this.name=name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String  name;

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("artist")
    @Expose
    private Artist artist;
    @SerializedName("chordsPresent")
    @Expose
    private Boolean chordsPresent;
    @SerializedName("tabTypes")
    @Expose
    private List<String> tabTypes = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Boolean getChordsPresent() {
        return chordsPresent;
    }

    public void setChordsPresent(Boolean chordsPresent) {
        this.chordsPresent = chordsPresent;
    }

    public List<String> getTabTypes() {
        return tabTypes;
    }

    public void setTabTypes(List<String> tabTypes) {
        this.tabTypes = tabTypes;
    }
}
