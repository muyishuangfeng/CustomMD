package com.example.custom;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.custom.bs.BottomSheetsDemoActivity;
import com.example.custom.bt.BarTabDemoActivity;
import com.example.custom.cardview.CardViewDemoActivity;
import com.example.custom.collapsing.CollapsingDemoActivity;
import com.example.custom.listview.ListViewDemoActivity;
import com.example.custom.navigation.NavigationDemoActivity;
import com.example.custom.recycler.RecyclerDemoActivity;
import com.example.custom.snackbar.SnackBarDemoActivity;
import com.example.custom.toolbar.ToolDemoActivity;
import com.example.custom.translucent.TranslucentDemoActivity;

/**
 * Created by Silence on 2016/9/20.
 */
public class ThirdActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        findViewById(R.id.btn_translucent_demo).setOnClickListener(this);
        findViewById(R.id.btn_toolbar_demo).setOnClickListener(this);
        findViewById(R.id.btn_navigation_demo).setOnClickListener(this);
        findViewById(R.id.btn_listview_demo).setOnClickListener(this);
        findViewById(R.id.btn_recycler_demo).setOnClickListener(this);
        findViewById(R.id.btn_card_view).setOnClickListener(this);
        findViewById(R.id.btn_snack_bar).setOnClickListener(this);
        findViewById(R.id.btn_bar_tab).setOnClickListener(this);
        findViewById(R.id.btn_collapsing).setOnClickListener(this);
        findViewById(R.id.btn_bottom_sheets).setOnClickListener(this);
        findViewById(R.id.btn_into).setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int viewId = view.getId();
       if (viewId == R.id.btn_toolbar_demo) {
            Intent intent = new Intent(this, ToolDemoActivity.class);
            startActivity(intent);
       } else if (viewId == R.id.btn_recycler_demo) {
           Intent intent = new Intent(this, RecyclerDemoActivity.class);
           startActivity(intent);

       } else if (viewId == R.id.btn_into) {
           Intent intent = new Intent(this, MainActivity.class);
           startActivity(intent);
        }else if (viewId == R.id.btn_navigation_demo) {
           Intent intent = new Intent(this, NavigationDemoActivity.class);
           startActivity(intent);
       }else if (viewId == R.id.btn_card_view) {
           Intent intent = new Intent(this, CardViewDemoActivity.class);
           startActivity(intent);
        }else if (viewId == R.id.btn_collapsing) {
        Intent intent = new Intent(this,CollapsingDemoActivity.class);
        startActivity(intent);
    }else if (viewId == R.id.btn_bar_tab) {
           Intent intent = new Intent(this,BarTabDemoActivity.class);
           startActivity(intent);
       }else if (viewId == R.id.btn_bottom_sheets) {
        Intent intent = new Intent(this,BottomSheetsDemoActivity.class);
        startActivity(intent);
    }else if (viewId == R.id.btn_translucent_demo) {
           Intent intent = new Intent(this,TranslucentDemoActivity.class);
           startActivity(intent);
       }else if (viewId == R.id.btn_snack_bar) {
           Intent intent = new Intent(this,SnackBarDemoActivity.class);
           startActivity(intent);
       }else if (viewId == R.id.btn_listview_demo) {
           Intent intent = new Intent(this,ListViewDemoActivity.class);
           startActivity(intent);
       }


    }
}
