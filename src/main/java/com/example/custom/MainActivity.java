package com.example.custom;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // if (Build.VERSION.SDK_INT>21){

            //获取当前界面的DecorView
         //  View dropView =getWindow().getDecorView();
            //设置全屏
           // int option=View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION|View.SYSTEM_UI_FLAG_FULLSCREEN|View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
           //置系统UI元素的可见性
          //  dropView.setSystemUiVisibility(option);
           // getWindow().setNavigationBarColor(Color.TRANSPARENT);
          //  getWindow().setStatusBarColor(Color.TRANSPARENT);
      //  }
       // ActionBar actionBar =getSupportActionBar();
        //ActionBar隐藏
      //  actionBar.hide();
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);

        if (hasFocus&&Build.VERSION.SDK_INT>19){
            View dropView=getWindow().getDecorView();
            dropView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                    | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        }
    }
}
