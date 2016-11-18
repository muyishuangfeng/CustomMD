package com.example.custom.toolbar;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.custom.R;
import com.example.custom.base.BaseActivity;


/**
 * Toolbar的基本使用
 */
public class ToolBarActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tool_bar);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //设置导航栏图标
        toolbar.setNavigationIcon(R.mipmap.ic_drawer_home);
        //设置app logo
        toolbar.setLogo(R.mipmap.ic_launcher);

        //设置主标题
        toolbar.setTitle("Title");
        //设置主标题颜色
        toolbar.setTitleTextColor(getResources().getColor(android.R.color.white));
        //修改主标题的外观，包括文字颜色，文字大小等
        toolbar.setTitleTextAppearance(this, R.style.Theme_ToolBar_Base_Title);

        //设置子标题
        toolbar.setSubtitle("Subtitle");
        //设置子标题颜色
        toolbar.setSubtitleTextColor(getResources().getColor(android.R.color.darker_gray));
        //设置子标题的外观，包括文字颜色，文字大小等
        toolbar.setSubtitleTextAppearance(this, R.style.Theme_ToolBar_Base_Subtitle);

        //设置右上角的填充菜单
        toolbar.inflateMenu(R.menu.base_toolbar_menu);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                int menuItemId = item.getItemId();
                if (menuItemId == R.id.action_search) {
                    Toast.makeText(ToolBarActivity.this, R.string.menu_search, Toast.LENGTH_SHORT).show();

                } else if (menuItemId == R.id.action_notification) {
                    Toast.makeText(ToolBarActivity.this, R.string.menu_notifications, Toast.LENGTH_SHORT).show();

                } else if (menuItemId == R.id.action_item1) {
                    Toast.makeText(ToolBarActivity.this, R.string.item_01, Toast.LENGTH_SHORT).show();

                } else if (menuItemId == R.id.action_item2) {
                    Toast.makeText(ToolBarActivity.this, R.string.item_02, Toast.LENGTH_SHORT).show();

                }
                return true;
            }
        });

    }

}
