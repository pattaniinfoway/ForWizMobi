package com.bu.forwizmobi.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bu.forwizmobi.R;
import com.github.vipulasri.timelineview.TimelineView;
import com.google.android.material.card.MaterialCardView;

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

        if(position==0)
        {
           holder.timeline.initLine(1);;
        }else{
            holder.timeline.initLine(0);;
        }

        if(position%2==0)
        {
            holder.timeline.setMarker(mContext.getDrawable(R.drawable.ic_group));
            holder.card.setVisibility(View.VISIBLE);
        }else{
            holder.timeline.setMarker(mContext.getDrawable(R.drawable.rotate_marker_point));
            holder.card.setVisibility(View.GONE);
        }

    }



    public class TimeLineViewHolder extends RecyclerView.ViewHolder {

        TimelineView timeline;
        RelativeLayout card;

        public TimeLineViewHolder(@NonNull View itemView) {
            super(itemView);
            timeline=(TimelineView)itemView.findViewById(R.id.timeline);
            card=(RelativeLayout)itemView.findViewById(R.id.card);

        }
    }


    @Override
    public int getItemCount() {
        return 8;
    }
}
