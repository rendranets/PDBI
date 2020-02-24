package com.dicoding.pdbi.api;

import com.dicoding.pdbi.model.RecentEntry.RecentEntry;

public class JSONResponse {

    /** untuk menampilkan data yang ada di API */

    private RecentEntry[] Recent;

    public RecentEntry[] getRecent(){
        return Recent;
    }


}
