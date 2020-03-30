package com.aw.vtools.mock;

import com.aw.vtools.model.QMUIGroupItemModel;
import com.aw.vtools.model.QMUIGroupModel;
import com.qmuiteam.qmui.widget.grouplist.QMUICommonListItemView;

import java.util.ArrayList;
import java.util.List;

public class MockData {

    /**
     * mock 首页数据
     * @return
     */
    public static List<QMUIGroupModel> mockIndexData(){
        List<QMUIGroupModel> modelList = new ArrayList<>();

        QMUIGroupModel modelScroll = new QMUIGroupModel();
        modelScroll.setTitle("滚动");
        List<QMUIGroupItemModel> itemModelList = new ArrayList<>();
        QMUIGroupItemModel modelText = new QMUIGroupItemModel();
        modelText.setItemTitle("文字");
        modelText.setContent("文字全屏滚动");
        modelText.setAccessoryType(QMUICommonListItemView.ACCESSORY_TYPE_CHEVRON);
        QMUIGroupItemModel modelPicture = new QMUIGroupItemModel();
        modelPicture.setItemTitle("图片");
        modelPicture.setContent("图片全屏滚动");
        modelPicture.setAccessoryType(QMUICommonListItemView.ACCESSORY_TYPE_CHEVRON);
        QMUIGroupItemModel modelPhiz = new QMUIGroupItemModel();
        modelPhiz.setItemTitle("表情");
        modelPhiz.setAccessoryType(QMUICommonListItemView.ACCESSORY_TYPE_CHEVRON);
        modelPhiz.setContent("表情魔性全屏滚动");
        QMUIGroupItemModel modelBarrage = new QMUIGroupItemModel();
        modelBarrage.setItemTitle("弹幕");
        modelBarrage.setContent("弹幕来袭！");
        modelBarrage.setAccessoryType(QMUICommonListItemView.ACCESSORY_TYPE_CHEVRON);

        itemModelList.add(modelText);
        itemModelList.add(modelPicture);
        itemModelList.add(modelPhiz);
        itemModelList.add(modelBarrage);
        modelScroll.setItemModels(itemModelList);


        QMUIGroupModel modelTime = new QMUIGroupModel();
        modelTime.setTitle("时间");
        List<QMUIGroupItemModel> itemModelList2 = new ArrayList<>();
        QMUIGroupItemModel modelCountdown = new QMUIGroupItemModel();
        modelCountdown.setItemTitle("倒计时");
        modelCountdown.setContent("时间倒计");
        modelCountdown.setAccessoryType(QMUICommonListItemView.ACCESSORY_TYPE_CHEVRON);
        QMUIGroupItemModel modelTiming = new QMUIGroupItemModel();
        modelTiming.setItemTitle("计时器");
        modelTiming.setContent("时间计时");
        modelTiming.setAccessoryType(QMUICommonListItemView.ACCESSORY_TYPE_CHEVRON);
        QMUIGroupItemModel modelTip = new QMUIGroupItemModel();
        modelTip.setItemTitle("定时提醒");
        modelTip.setContent("后台定时提醒");
        modelTip.setAccessoryType(QMUICommonListItemView.ACCESSORY_TYPE_CHEVRON);
        QMUIGroupItemModel modelLock = new QMUIGroupItemModel();
        modelLock.setItemTitle("Now时间");
        modelLock.setContent("显示当前时间");
        modelLock.setAccessoryType(QMUICommonListItemView.ACCESSORY_TYPE_CHEVRON);
        itemModelList2.add(modelCountdown);
        itemModelList2.add(modelTiming);
        itemModelList2.add(modelTip);
        itemModelList2.add(modelLock);

        modelTime.setItemModels(itemModelList2);


        QMUIGroupModel modelMore = new QMUIGroupModel();
        modelMore.setTitle("更多玩法");
        List<QMUIGroupItemModel> itemModelList3 = new ArrayList<>();
        QMUIGroupItemModel modelRandom = new QMUIGroupItemModel();
        modelRandom.setItemTitle("随机数");
        modelRandom.setContent("抽奖、抽签");
        modelRandom.setAccessoryType(QMUICommonListItemView.ACCESSORY_TYPE_CHEVRON);
        QMUIGroupItemModel modelFlicker = new QMUIGroupItemModel();
        modelFlicker.setItemTitle("闪屏");
        modelFlicker.setContent("多颜色闪屏特效");
        modelFlicker.setAccessoryType(QMUICommonListItemView.ACCESSORY_TYPE_CHEVRON);
        modelMore.setItemModels(itemModelList3);
        QMUIGroupItemModel modelClick = new QMUIGroupItemModel();
        modelClick.setItemTitle("疯狂点击");
        modelClick.setContent("考验手速的时候到了");
        modelClick.setAccessoryType(QMUICommonListItemView.ACCESSORY_TYPE_CHEVRON);
        QMUIGroupItemModel modelMora = new QMUIGroupItemModel();
        modelMora.setItemTitle("猜拳");
        modelMora.setContent("多人猜拳游戏");
        modelMora.setAccessoryType(QMUICommonListItemView.ACCESSORY_TYPE_CHEVRON);
        QMUIGroupItemModel modelDice = new QMUIGroupItemModel();
        modelDice.setItemTitle("骰子");
        modelDice.setContent("掷骰子");
        modelDice.setAccessoryType(QMUICommonListItemView.ACCESSORY_TYPE_CHEVRON);
        itemModelList3.add(modelRandom);
        itemModelList3.add(modelFlicker);
        itemModelList3.add(modelClick);
        itemModelList3.add(modelMora);
        itemModelList3.add(modelDice);
        modelList.add(modelScroll);
        modelList.add(modelTime);
        modelList.add(modelMore);

        return modelList;
    }
}
