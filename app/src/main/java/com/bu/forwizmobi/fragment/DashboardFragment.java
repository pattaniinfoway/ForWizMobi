package com.bu.forwizmobi.fragment;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bu.forwizmobi.R;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class DashboardFragment extends BaseFragment {


    private Context mContext;
    private View view;

    BarChart barChart;
    BarData barData;
    BarDataSet barDataSet;
    ArrayList barEntries;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = getActivity();

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
     //   view = inflater.inflate(R.layout.layout_dashboard, container, false);
        view = inflater.inflate(R.layout.dashboard_layout, container, false);
        initViews();
        getEntries();
        setBarChart();

        return view;

    }

    private void setBarChart() {

        barDataSet = new BarDataSet(barEntries, "");
        barData = new BarData(barDataSet);
        barChart.setData(barData);
        //barDataSet.setColors(ColorTemplate.LIBERTY_COLORS);
        barDataSet.setColors(
                ContextCompat.getColor(barChart.getContext(), R.color.blue),
                ContextCompat.getColor(barChart.getContext(), R.color.blue),
                ContextCompat.getColor(barChart.getContext(), R.color.blue)
        );
        barDataSet.setValueTextColor(Color.BLACK);
        barDataSet.setValueTextSize(18f);
    }

    private void initViews() {
        barChart = view.findViewById(R.id.BarChart);
    }


    private void getEntries() {
        barEntries = new ArrayList<>();
        barEntries.add(new BarEntry(2f, 0));
        barEntries.add(new BarEntry(4f, 1));
        barEntries.add(new BarEntry(6f, 1));
        barEntries.add(new BarEntry(8f, 3));
        barEntries.add(new BarEntry(7f, 4));
        barEntries.add(new BarEntry(3f, 3));
    }
}
