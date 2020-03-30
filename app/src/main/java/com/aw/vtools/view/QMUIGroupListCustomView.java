package com.aw.vtools.view;

import android.content.Context;
import android.view.View;

import com.aw.vtools.model.QMUIGroupItemModel;
import com.aw.vtools.model.QMUIGroupModel;
import com.qmuiteam.qmui.widget.grouplist.QMUICommonListItemView;
import com.qmuiteam.qmui.widget.grouplist.QMUIGroupListView;

import org.apache.commons.lang3.StringUtils;

import java.util.List;

public class QMUIGroupListCustomView extends View{

    View.OnClickListener listener = null;
    Context context = null;
    public QMUIGroupListCustomView( Context context){
        super(context);
        this.context = context;
    }

    public void newSection(List<QMUIGroupModel> modelList, QMUIGroupListView groupListView, View.OnClickListener listener){
        this.listener = listener;
        for (QMUIGroupModel model : modelList) {
            QMUIGroupListView.Section section = QMUIGroupListView.newSection(context);
            if (StringUtils.isNotBlank(model.getTitle())){
                section.setTitle(model.getTitle());
            }
            for (QMUIGroupItemModel item : model.getItemModels()) {
                QMUICommonListItemView itemView = groupListView.createItemView(item.getItemTitle());
                itemView.setDetailText(item.getContent());
                itemView.setTag(modelList.indexOf(model)+"#"+model.getItemModels().indexOf(item));
                itemView.setAccessoryType(item.getAccessoryType());
                section.addItemView(itemView,listener);
            }
            section.addTo(groupListView);
        }
    }
}
