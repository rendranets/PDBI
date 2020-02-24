
package com.dicoding.pdbi.model.RecentEntry;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RecentEntryResponse {

    @SerializedName("data")
    @Expose
    private List<RecentEntry> data = null;

    public List<RecentEntry> getData() {
        return data;
    }

    public void setData(List<RecentEntry> data) {
        this.data = data;
    }

}
