package com.bu.forwizmobi.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bu.forwizmobi.R;
import com.bu.forwizmobi.adapter.ExampleTimeLineAdapter;
import com.bu.forwizmobi.utils.VerticalSpaceItemDecoration;

public class TimeLineFragment extends BaseFragment {


    private Context mContext;
    private View view;
    private LinearLayoutManager mLayoutManager;
    private RecyclerView recyclerView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = getActivity();

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.layout_timeline, container, false);
        //initViews();

        recyclerView=(RecyclerView)view.findViewById(R.id.recyclerView);
        setUpLayoutManager();
        return  view;
    }



    private void setUpLayoutManager() {

        mLayoutManager = new LinearLayoutManager(mContext, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new VerticalSpaceItemDecoration(5));

        ExampleTimeLineAdapter prodcutAdapter = new ExampleTimeLineAdapter(mContext);
        recyclerView.setAdapter(prodcutAdapter);
    }
}
