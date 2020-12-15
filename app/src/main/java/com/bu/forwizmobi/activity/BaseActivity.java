package com.bu.forwizmobi.activity;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


public class BaseActivity extends AppCompatActivity {


    Context mContext;
    public Uri mCameraImageUri;
    int columnIndex;
    AlertDialog.Builder alertDialog;
    private int camerPermission;
    private int READ_PHONE_STATE;
    private int WRITE_EXTERNAL_STORAGE;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = BaseActivity.this;
    }






}

