package com.dicoding.pdbi.model.RecentEntry;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class File {

    @SerializedName("file_id")
    @Expose
    private String fileId;
    @SerializedName("file_name")
    @Expose
    private String fileName;
    @SerializedName("file_bin")
    @Expose
    private String fileBin;
    @SerializedName("image_width")
    @Expose
    private String imageWidth;
    @SerializedName("image_heigh")
    @Expose
    private String imageHeigh;

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileBin() {
        return fileBin;
    }

    public void setFileBin(String fileBin) {
        this.fileBin = fileBin;
    }

    public String getImageWidth() {
        return imageWidth;
    }

    public void setImageWidth(String imageWidth) {
        this.imageWidth = imageWidth;
    }

    public String getImageHeigh() {
        return imageHeigh;
    }

    public void setImageHeigh(String imageHeigh) {
        this.imageHeigh = imageHeigh;
    }

}