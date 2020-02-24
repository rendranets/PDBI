//package com.dicoding.pdbi.adapter;
//
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//import android.widget.ListView;
//import android.widget.TextView;
//
//import com.dicoding.pdbi.R;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//public class RecentAdapter extends RecyclerView.Adapter {
//    @NonNull
//    @Override
//    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.data_budaya_item, parent, false);
//        return new ListViewHolder(view);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
//        ((ListViewHolder) holder).bindView(position);
//    }
//
//    @Override
//    public int getItemCount() {
//        return RecentData.title.length;
//    }
//
//    private class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
//
//        private TextView tv1;
//        private TextView tv2;
//        private TextView tv3;
//        private TextView tv4;
//
//        public ListViewHolder(View itemView) {
//            super(itemView);
//            tv1 = itemView.findViewById(R.id.tv_title_home);
//            tv2 = itemView.findViewById(R.id.tv_content_home);
//            tv3 = itemView.findViewById(R.id.tv_category_home);
//            tv4 = itemView.findViewById(R.id.tv_location_home);
//            itemView.setOnClickListener(this);
//        }
//
//        public void bindView(int position) {
//            tv1.setText(RecentData.title[position]);
//            tv2.setText(RecentData.desc[position]);
//            tv3.setText(RecentData.catego[position]);
//            tv4.setText(RecentData.locate[position]);
//
//        }
//
//        @Override
//        public void onClick(View view) {
//
//                    }
//    }
//
//}
