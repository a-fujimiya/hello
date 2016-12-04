package com.example.atyk.hello;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  @Override protected void onStart() {
    super.onStart();
    final TextView msg = (TextView) findViewById(R.id.text_area);
    final Button button = (Button) findViewById(R.id.button_toggle);
    button.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View view) {
        if (msg.getVisibility() == View.INVISIBLE) {
          button.setText(R.string.button_text_hide);
          msg.setVisibility(View.VISIBLE);
        } else {
          button.setText(R.string.button_text_show);
          msg.setVisibility(View.INVISIBLE);
        }
      }
    });
  }

  @Override protected void onStop() {
    super.onStop();
  }
}
