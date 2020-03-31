package com.aw.vtools.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.aw.vtools.R;
import com.aw.vtools.activity.time.TextScrollActivity;
import com.aw.vtools.mock.MockData;
import com.aw.vtools.model.QMUIGroupModel;
import com.aw.vtools.util.ToastUtil;
import com.aw.vtools.view.QMAutoCustomDialogBuilder;
import com.aw.vtools.view.QMUIGroupListCustomView;
import com.qmuiteam.qmui.util.QMUIKeyboardHelper;
import com.qmuiteam.qmui.widget.dialog.QMUIDialog;
import com.qmuiteam.qmui.widget.dialog.QMUIDialogAction;
import com.qmuiteam.qmui.widget.grouplist.QMUICommonListItemView;
import com.qmuiteam.qmui.widget.grouplist.QMUIGroupListView;

import org.apache.commons.lang3.StringUtils;

import java.util.List;


public class MainActivity extends AppCompatActivity {

    private QMUIGroupListView groupListView;
    private List<QMUIGroupModel> qmuiGroupModels;
    private  QMAutoCustomDialogBuilder autoTestDialogBuilder;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        groupListView = findViewById(R.id.groupListView);
        QMUIGroupListCustomView groupListView = new QMUIGroupListCustomView(this);
        qmuiGroupModels = MockData.mockIndexData();
        groupListView.newSection(qmuiGroupModels, this.groupListView, new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                QMUICommonListItemView viewList = (QMUICommonListItemView) v;
                String[] split = StringUtils.split((String) viewList.getTag(), "#");
                Integer parentIndex = Integer.valueOf(split[0]);
                Integer itemIndex = Integer.valueOf(split[1]);
                switchItem(parentIndex, itemIndex, viewList);
            }
        });
    }

    /**
     * 点击item触发事件
     *
     * @param parentIndex
     * @param itemIndex
     */
    private void switchItem(Integer parentIndex, Integer itemIndex, QMUICommonListItemView viewList) {
        ToastUtil.showShort(MainActivity.this, "选项：" + qmuiGroupModels.get(parentIndex).getTitle() + "-" + viewList.getText() + " 点击了");
        if (0 == parentIndex) {
            clickScrollItem(itemIndex, viewList);
        } else if (1 == parentIndex) {
            clickTimeItem(itemIndex, viewList);
        } else {
            clickMoreItem(itemIndex, viewList);
        }
    }

    /**
     * 更多玩法点击
     *
     * @param itemIndex
     * @param viewList
     */
    private void clickMoreItem(Integer itemIndex, QMUICommonListItemView viewList) {

    }

    /**
     * 时间列表点击
     *
     * @param itemIndex
     * @param viewList
     */
    private void clickTimeItem(Integer itemIndex, QMUICommonListItemView viewList) {
    }

    /**
     * 滚动列表点击
     *
     * @param itemIndex
     * @param viewList
     */
    private void clickScrollItem(Integer itemIndex, QMUICommonListItemView viewList) {
        switch (itemIndex) {
            case 0:
                showAutoDialog();
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
    }

    private void showAutoDialog() {
            autoTestDialogBuilder = (QMAutoCustomDialogBuilder) new QMAutoCustomDialogBuilder(getActivity())
                .addAction("取消", new QMUIDialogAction.ActionListener() {
                    @Override
                    public void onClick(QMUIDialog dialog, int index) {
                        dialog.dismiss();
                    }
                })
                .addAction("确定", new QMUIDialogAction.ActionListener() {
                    @Override
                    public void onClick(QMUIDialog dialog, int index) {
                        final String content = autoTestDialogBuilder.getEditText().getText().toString();
                        RadioGroup radioGroup = autoTestDialogBuilder.getRadioGroup();
                        RadioButton rb = null;
                        if (StringUtils.isBlank(content)){
                            return;
                        }
                        for (int i= 0;i<radioGroup.getChildCount();i++){
                            rb = (RadioButton)radioGroup.getChildAt(i);
                            if (rb.isChecked()){
                                break;
                            }
                        }
                        dialog.dismiss();
                        Intent intent = new Intent(MainActivity.this, TextScrollActivity.class);
                        intent.putExtra("content",content);
                        intent.putExtra("type",rb.getText().toString());
                        startActivity(intent);
                    }
                });
        autoTestDialogBuilder.show();
        QMUIKeyboardHelper.showKeyboard(autoTestDialogBuilder.getEditText(), true);
}

    private Context getActivity() {
        return MainActivity.this;
    }
    }