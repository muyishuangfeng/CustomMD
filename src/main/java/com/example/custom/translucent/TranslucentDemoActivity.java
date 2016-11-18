package com.example.custom.translucent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.custom.R;


public class TranslucentDemoActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translucent_demo);

        findViewById(R.id.btn_image_translucent).setOnClickListener(this);
        findViewById(R.id.btn_color_translucent).setOnClickListener(this);
        findViewById(R.id.btn_best_translucent).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int viewId = v.getId();
        if (viewId == R.id.btn_image_translucent) {
            Intent translucentBarIntent = new Intent(this, ImageTranslucentBarActivity.class);
            startActivity(translucentBarIntent);

        } else if (viewId == R.id.btn_color_translucent) {
            Intent translucentBarIntent = new Intent(this, ColorTranslucentBarActivity.class);
            startActivity(translucentBarIntent);

        } else if (viewId == R.id.btn_best_translucent) {
            Intent translucentBarIntent = new Intent(this, BestTranslucentBarActivity.class);
            startActivity(translucentBarIntent);

        }
    }
}
