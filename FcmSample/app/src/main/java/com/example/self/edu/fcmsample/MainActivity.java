package com.example.self.edu.fcmsample;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.self.edu.fcmsample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
    binding.exception.setOnClickListener(v -> {
      Toast.makeText(getApplicationContext(), "ガッ!!", Toast.LENGTH_SHORT).show();
      throw new NullPointerException();
    });


  }
}
