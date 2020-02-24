package com.dicoding.pdbi.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dicoding.pdbi.R;
import com.dicoding.pdbi.model.RecentEntry.RecentEntry;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class RecentEntryAdapter extends RecyclerView.Adapter<RecentEntryAdapter.ViewHolder> {

    private ArrayList<RecentEntry> recentList;
    public RecentEntryAdapter(ArrayList<RecentEntry> recentList) {
        this.recentList = recentList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.data_budaya_item,parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        RecentEntry recentEntry = recentList.get(position);
        holder.tv_title_home.setText(recentEntry.getTitle());
    }


    @Override
    public int getItemCount(){
    return recentList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tv_title_home, tv_content_home, tv_category_home, tv_location_home;

        public ViewHolder(View view) {
            super(view);
            tv_title_home = view.findViewById(R.id.tv_title_home);
            /**
            tv_content_home = view.findViewById(R.id.tv_content_home);
            tv_category_home = view.findViewById(R.id.tv_category_home);
            tv_location_home = view.findViewById(R.id.tv_location_home);
             **/
        }

    }

}
