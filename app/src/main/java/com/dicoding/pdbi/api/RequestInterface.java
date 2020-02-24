package com.dicoding.pdbi.api;

import com.dicoding.pdbi.model.RecentEntry.RecentEntry;
import com.dicoding.pdbi.model.RecentEntry.RecentEntryResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface RequestInterface {


    @POST("entry/recent/")
    @FormUrlEncoded
    Call<JSONResponse> getJSON();
}
