package com.example.atyk.hello;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
  @BindView(R.id.text_area) TextView msg;
  @BindView(R.id.button_toggle) Button button;
  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ButterKnife.bind(this);
  }

  @OnClick(R.id.button_toggle) public void onClickButton() {
    if (msg.getVisibility() == View.INVISIBLE) {
      button.setText(R.string.button_text_hide);
      msg.setVisibility(View.VISIBLE);
    } else {
      button.setText(R.string.button_text_show);
      msg.setVisibility(View.INVISIBLE);
    }
  }
}
