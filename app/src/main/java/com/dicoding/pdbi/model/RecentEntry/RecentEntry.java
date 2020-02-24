package com.dicoding.pdbi.model.RecentEntry;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RecentEntry {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("url_api")
    @Expose
    private String urlApi;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("status_d")
    @Expose
    private String statusD;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("type_d")
    @Expose
    private String typeD;
    @SerializedName("revise_no")
    @Expose
    private Integer reviseNo;
    @SerializedName("created_by")
    @Expose
    private CreatedBy createdBy;
    @SerializedName("fields")
    @Expose
    private Fields fields;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrlApi() {
        return urlApi;
    }

    public void setUrlApi(String urlApi) {
        this.urlApi = urlApi;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusD() {
        return statusD;
    }

    public void setStatusD(String statusD) {
        this.statusD = statusD;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTypeD() {
        return typeD;
    }

    public void setTypeD(String typeD) {
        this.typeD = typeD;
    }

    public Integer getReviseNo() {
        return reviseNo;
    }

    public void setReviseNo(Integer reviseNo) {
        this.reviseNo = reviseNo;
    }

    public CreatedBy getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(CreatedBy createdBy) {
        this.createdBy = createdBy;
    }

    public Fields getFields() {
        return fields;
    }

    public void setFields(Fields fields) {
        this.fields = fields;
    }



}