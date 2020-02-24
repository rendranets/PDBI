package com.dicoding.pdbi.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.dicoding.pdbi.R;
import com.dicoding.pdbi.SelectLocation;
//import com.dicoding.pdbi.adapter.RecentAdapter;
import com.dicoding.pdbi.adapter.RecentEntryAdapter;
import com.dicoding.pdbi.api.JSONResponse;
import com.dicoding.pdbi.api.RequestInterface;
import com.dicoding.pdbi.model.RecentEntry.RecentEntry;
import com.dicoding.pdbi.model.RecentEntry.RecentEntryResponse;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class HomeFragment extends Fragment {


    private RecyclerView rvRecentEntry;
    private ArrayList<RecentEntry> list = new ArrayList<>();
    private RecentEntryAdapter recentEntryAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);

        Button buttonLocation = v.findViewById(R.id.button_location);
        buttonLocation.setOnClickListener(v1 -> {
            Intent moveIntent = new Intent(getActivity(), SelectLocation.class);
            startActivity(moveIntent);
        });

        loadJSON();
        //rvRecentEntry = recyclerview
        rvRecentEntry = v.findViewById(R.id.rv_recent_entry);
        rvRecentEntry.setHasFixedSize(true);

//        rvRecentEntry.setAdapter(recentEntryAdapter);


        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        rvRecentEntry.setLayoutManager(layoutManager); loadJSON();


        return v;
    }

    //deklarasi link server
    private void loadJSON(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.budaya-indonesia.org/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        RequestInterface requestInterface = retrofit.create(RequestInterface.class);
        Call<JSONResponse> call = requestInterface.getJSON();
        call.enqueue(new Callback<JSONResponse>() {
            @Override
            public void onResponse(Call<JSONResponse> call, Response<JSONResponse> response) {
                JSONResponse jsonResponse =response.body();
                list = new ArrayList<>(Arrays.asList(jsonResponse.getRecent()));
                recentEntryAdapter = new RecentEntryAdapter(list);
                rvRecentEntry.setAdapter(recentEntryAdapter);
            }

            @Override
            public void onFailure(Call<JSONResponse> call, Throwable t) {
                Log.d("Error", t.getMessage());
            }
        });
    }

}
