package com.example.yolo_.nanodegree_project_0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user touches the button */
    public void onClick_btn_P0(View view) {
        switch(view.getId()){
            case R.id.btn_P0_popularMovie:
                // Do something in response to button click;
                Toast.makeText(getApplicationContext(),"This button will lauch my popularMovie app.",Toast.LENGTH_SHORT).show();
            break;
            case R.id.btn_P0_stockHawk:
                // Do something in response to button click;
                Toast.makeText(getApplicationContext(),"This button will lauch my stockhawk app.",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_P0_buildItBigger:
                // Do something in response to button click;
                Toast.makeText(getApplicationContext(),"This button will lauch my BUILD IT BIGGER app.",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_P0_capstone:
                // Do something in response to button click;
                Toast.makeText(getApplicationContext(),"This button will lauch my capstone app.",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_P0_makeYourAppMaterial:
                // Do something in response to button click;
                Toast.makeText(getApplicationContext(),"This button will lauch my MAKE_YOUR_APP_MATERIAL app.",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_P0_goUbiquitous:
                // Do something in response to button click;
                Toast.makeText(getApplicationContext(),"This button will lauch my GO UBIQUITOUS app.",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
