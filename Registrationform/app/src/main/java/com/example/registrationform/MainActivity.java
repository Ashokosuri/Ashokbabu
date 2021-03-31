package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Toast;

import com.example.registrationform.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
ActivityMainBinding binding;
String gender,knowncourses,userrating,userprogress;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     binding= DataBindingUtil. setContentView(this,R.layout.activity_main);
     binding.rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
         @Override
         public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
             binding.tvResult.setText("Rating is:"+rating);

         }
     });
     binding.sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
         @Override
         public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
             binding.tvResult.setText("Your progress:"+progress);
         }

         @Override
         public void onStartTrackingTouch(SeekBar seekBar) {

         }

         @Override
         public void onStopTrackingTouch(SeekBar seekBar) {

         }
     });
    }

    public void showData(View view) {
        Toast.makeText(this, "ding", Toast.LENGTH_SHORT).show();
        String name=binding.etUsername.getText().toString();
        String email=binding.etUseremail.getText().toString();
        String mobile=binding.etUserMobileNumber.getText().toString();
        String password=binding.etUserpassword.getText().toString();
        String address=binding.etAddress.getText().toString();
        if(binding.male.isChecked())
        {
            gender="male";
        }
        else if(binding.female.isChecked())
        {
            gender="female";
        }
        binding.rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                userrating=String.valueOf(rating);
            }
        });
        Intent intentobj=new Intent(this,DetailsActivity.class);
        startActivity(intentobj);
    }
}