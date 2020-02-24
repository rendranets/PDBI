package com.dicoding.pdbi.model.RecentEntry;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Fields {

    @SerializedName("element")
    @Expose
    private String element;
    @SerializedName("province")
    @Expose
    private String province;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("file")
    @Expose
    private List<File> file = null;
    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("from")
    @Expose
    private String from;

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<File> getFile() {
        return file;
    }

    public void setFile(List<File> file) {
        this.file = file;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

}