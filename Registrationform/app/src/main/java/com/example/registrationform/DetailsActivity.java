package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.registrationform.databinding.ActivityMainBinding;

public class DetailsActivity extends AppCompatActivity {
        ActivityMainBinding detailsBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        detailsBinding= DataBindingUtil.setContentView(this,R.layout.activity_details);
    }
}