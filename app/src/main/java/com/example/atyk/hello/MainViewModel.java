package com.example.atyk.hello;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.util.Log;
import android.view.View;

public class MainViewModel extends BaseObservable {
  @Bindable private String buttonText;
  private String msg;
  private Context context;
  private boolean isShowMsg;

  public MainViewModel(Context context, String msg) {
    this.context = context;
    this.msg = msg;
  }

  public String getMsg() {
    return msg;
  }

  public boolean isShowMsg() {
    return isShowMsg;
  }

  public String getButtonText() {
    return buttonText;
  }

  public void setButtonText(String text) {
    buttonText = text;
  }

  public void onClickButton(View view) {
    if (isShowMsg) {
      buttonText = context.getString(R.string.button_text_show);
    } else {
      buttonText = context.getString(R.string.button_text_hide);
    }
    isShowMsg = !isShowMsg;
    Log.i("@@@", "onClick: " + isShowMsg);
    notifyPropertyChanged(BR._all);
  }
}
