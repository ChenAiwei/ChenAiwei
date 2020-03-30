package com.aw.vtools.activity;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.aw.vtools.R;
import com.aw.vtools.mock.MockData;
import com.aw.vtools.model.QMUIGroupModel;
import com.aw.vtools.util.ToastUtil;
import com.aw.vtools.view.QMUIGroupListCustomView;
import com.qmuiteam.qmui.widget.grouplist.QMUICommonListItemView;
import com.qmuiteam.qmui.widget.grouplist.QMUIGroupListView;

import org.apache.commons.lang3.StringUtils;

import java.util.List;


public class MainActivity extends AppCompatActivity {

    private QMUIGroupListView groupListView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        groupListView = findViewById(R.id.groupListView);
        QMUIGroupListCustomView groupListView = new QMUIGroupListCustomView(this);
        List<QMUIGroupModel> qmuiGroupModels = MockData.mockIndexData();
        groupListView.newSection(qmuiGroupModels, this.groupListView, new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                QMUICommonListItemView viewList = (QMUICommonListItemView) v;
                String[] split = StringUtils.split((String) viewList.getTag(), "#");
                Integer parentIndex = Integer.valueOf(split[0]);
                Integer itemIndex = Integer.valueOf(split[1]);
                ToastUtil.showShort(MainActivity.this, "选项：" + qmuiGroupModels.get(parentIndex).getTitle()+"-"+viewList.getText() + " 点击了");
            }
        });
    }
}
