package com.dgse.androidviper.ui.view.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.dgse.androidviper.R;
import com.dgse.androidviper.ui.view.base.MainView;

public class MainActivity extends AppCompatActivity implements MainView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
