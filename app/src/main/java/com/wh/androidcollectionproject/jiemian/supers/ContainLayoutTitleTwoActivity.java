package com.wh.androidcollectionproject.jiemian.supers;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.wh.androidcollectionproject.R;
import com.wh.androidcollectionproject.jiemian.utils.ToolsBar;

public class ContainLayoutTitleTwoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contain_layout_title_two);
        ToolsBar jktoolbar = (ToolsBar) findViewById(R.id.jktoolbar);
        jktoolbar.setIcon(R.drawable.user, null);
        //jktoolbar.setTitleAlign(JKToolBar.TEXT_LEFT); 标题左对齐
        jktoolbar.setTitle("自定义标题");
        jktoolbar.addButton("扫一扫", null);
        jktoolbar.addButton(R.drawable.bt_icon_pet, new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ContainLayoutTitleTwoActivity.this, "点击按钮", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
