package com.zfliu.fallingsnow.Porfermor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zfliu.fallingsnow.R;
import com.zfliu.fallingsnow.View.MarqueeTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(this,MainService.class);
        startService(intent);
    }
}
