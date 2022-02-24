package com.example.buscadormusica;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Artist
{
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("nameWithoutThePrefix")
    @Expose
    private String nameWithoutThePrefix;
    @SerializedName("useThePrefix")
    @Expose
    private Boolean useThePrefix;
    @SerializedName("name")
    @Expose
    private String name;

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

    public String getNameWithoutThePrefix() {
        return nameWithoutThePrefix;
    }

    public void setNameWithoutThePrefix(String nameWithoutThePrefix) {
        this.nameWithoutThePrefix = nameWithoutThePrefix;
    }

    public Boolean getUseThePrefix() {
        return useThePrefix;
    }

    public void setUseThePrefix(Boolean useThePrefix) {
        this.useThePrefix = useThePrefix;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
