package com.bu.forwizmobi.activity;

import android.os.Bundle;
import android.view.View;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.bu.forwizmobi.R;
import com.bu.forwizmobi.fragment.DashboardFragment;
import com.bu.forwizmobi.fragment.TimeLineFragment;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadFragment(new TimeLineFragment());
    }


    public void loadFragment(Fragment fragment) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.frame, fragment, "fragment");
        ft.addToBackStack("fragment");
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        //        ft.addToBackStack(null);
        ft.commit();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.categories:
                loadFragment(new TimeLineFragment());
                break;
            case R.id.home:
                loadFragment(new DashboardFragment());
                break;
        }
    }
}
