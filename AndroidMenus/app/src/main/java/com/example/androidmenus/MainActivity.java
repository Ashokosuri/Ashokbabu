package com.example.androidmenus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
         getMenuInflater().inflate(R.menu.options_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.alert:
                showAlert();
                break;
            case R.id.datepicker:
                showdate();
                break;
            case R.id.timepicker:
                showtime();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void showtime() {
       // Toast.makeText(this,"item Time picker",Toast.LENGTH_SHORT).show();
    }

    private void showdate() {
       // Toast.makeText(this,"item date picker",Toast.LENGTH_SHORT).show();
    }

    private void showAlert() {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
                builder.setTitle("Alert..!");
                builder.setMessage("don't sleep in the class");
        builder.setIcon(R.drawable.ic_baseline_warning_24);
        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });

                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                     dialog.dismiss();
                    }
                });

                builder.show();
        //Toast.makeText(this,"item time picker",Toast.LENGTH_SHORT).show();
    }

}