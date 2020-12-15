package com.bu.forwizmobi.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bu.forwizmobi.R;

public class ExampleTimeLineAdapter extends RecyclerView.Adapter<ExampleTimeLineAdapter.TimeLineViewHolder> {

    Context mContext;

    public ExampleTimeLineAdapter(Context contextt) {

        this.mContext = contextt;

    }



    @NonNull
    @Override
    public ExampleTimeLineAdapter.TimeLineViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        TimeLineViewHolder holder;
        View mainview = LayoutInflater.from(mContext).inflate(R.layout.item_timeline, null);
        holder = new TimeLineViewHolder(mainview);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ExampleTimeLineAdapter.TimeLineViewHolder holder, int position) {

    }



    public class TimeLineViewHolder extends RecyclerView.ViewHolder {

        public TimeLineViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }


    @Override
    public int getItemCount() {
        return 5;
    }
}
