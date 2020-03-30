package com.aw.vtools.activity;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.aw.vtools.R;
import com.aw.vtools.mock.MockData;
import com.aw.vtools.util.ToastUtil;
import com.aw.vtools.view.QMUIGroupListCustomView;
import com.qmuiteam.qmui.widget.grouplist.QMUICommonListItemView;
import com.qmuiteam.qmui.widget.grouplist.QMUIGroupListView;


public class MainActivity extends AppCompatActivity {

    private QMUIGroupListView groupListView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        groupListView = findViewById(R.id.groupListView);
        QMUIGroupListCustomView groupListView = new QMUIGroupListCustomView(this);
        groupListView.newSection(MockData.mockIndexData(), this.groupListView, new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                QMUICommonListItemView viewList = (QMUICommonListItemView) v;
                ToastUtil.showShort(MainActivity.this, "选项：" + viewList.getTag() + " 点击了");
            }
        });
    }
}
