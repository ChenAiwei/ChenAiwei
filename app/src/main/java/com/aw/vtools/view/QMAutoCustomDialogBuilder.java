package com.aw.vtools.view;

import android.content.Context;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;

import com.aw.vtools.R;
import com.qmuiteam.qmui.widget.dialog.QMUIDialog;

public class QMAutoCustomDialogBuilder extends QMUIDialog.AutoResizeDialogBuilder {
    private Context context;
    private EditText editText;
    private RadioGroup radioGroup;


    public QMAutoCustomDialogBuilder(Context context) {
        super(context);
        this.context = context;
    }

    @Override
    public View onBuildContent(QMUIDialog dialog) {
        View inflate = (View) View.inflate(context, R.layout.scroll_dialog_content,null);
        editText = inflate.findViewById(R.id.scroll_edit);
        radioGroup = inflate.findViewById(R.id.scroll_radioGroup);
        return inflate;

    }

    public EditText getEditText() {
        return editText;
    }
    public RadioGroup getRadioGroup() {
        return radioGroup;
    }
}
