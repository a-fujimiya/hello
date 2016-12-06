package com.example.atyk.hello;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.example.atyk.hello.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
  private ActivityMainBinding binding;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
  }

  @Override protected void onStart() {
    super.onStart();
    MainViewModel viewModel = new MainViewModel(this, getString(R.string.display_text));
    binding.setViewModel(viewModel);
    viewModel.setButtonText(getString(R.string.button_text_show));
  }

  @Override protected void onStop() {
    super.onStop();
  }
}
