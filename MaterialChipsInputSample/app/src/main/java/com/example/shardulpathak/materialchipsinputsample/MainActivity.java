package com.example.shardulpathak.materialchipsinputsample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button mChipViewButton;
    TextView mChipDesignView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mChipDesignView = (TextView) findViewById(R.id.chips_sample_tv);
        mChipViewButton = (Button) findViewById(R.id.chip_view_button);
        mChipViewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //navigate to activity showing various implementations of ChipView
                Intent chipViewIntent = new Intent(getBaseContext(), ChipViewActivity.class);
                startActivity(chipViewIntent);
            }
        });
    }
}
