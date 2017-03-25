package com.example.atyk.hello

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
  }

  override fun onStart() {
    super.onStart()
    val msg = findViewById(R.id.text_area) as TextView
    val button = findViewById(R.id.button_toggle) as Button
    button.setOnClickListener {
      if (msg.visibility == View.INVISIBLE) {
        button.setText(R.string.button_text_hide)
        msg.visibility = View.VISIBLE
      } else {
        button.setText(R.string.button_text_show)
        msg.visibility = View.INVISIBLE
      }
    }
  }

  override fun onStop() {
    super.onStop()
  }
}
