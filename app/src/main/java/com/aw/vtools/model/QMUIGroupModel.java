package com.aw.vtools.model;

import java.util.List;

import lombok.Data;

@Data
public class QMUIGroupModel {
    private String title;
    private List<QMUIGroupItemModel> itemModels;
}
