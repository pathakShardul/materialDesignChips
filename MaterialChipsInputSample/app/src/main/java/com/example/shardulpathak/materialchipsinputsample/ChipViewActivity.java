package com.example.shardulpathak.materialchipsinputsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.pchmn.materialchips.ChipView;

public class ChipViewActivity extends AppCompatActivity {


    ChipView mFirstChipView;
    ChipView mSecondChipView;
    ChipView mThirdChipView;
    ChipView mFourthChipView;
    ChipView mFifthChipView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chip_view);

        mFirstChipView = (ChipView) findViewById(R.id.first_chip_view);
        mFirstChipView.setOnChipClicked(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "First Chip is clicked", Toast.LENGTH_SHORT).show();
            }

        });


        mSecondChipView = (ChipView) findViewById(R.id.second_chip_view);
        mSecondChipView.setOnChipClicked(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Second Chip is clicked", Toast.LENGTH_SHORT).show();
            }
        });

        mSecondChipView.setOnDeleteClicked(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Second Chip delete button is clicked", Toast.LENGTH_SHORT).show();
            }
        });

        mThirdChipView = (ChipView) findViewById(R.id.third_chip_view);
        mThirdChipView.setOnChipClicked(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Third Chip is clicked", Toast.LENGTH_SHORT).show();
            }
        });

        mThirdChipView.setOnDeleteClicked(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Third Chip delete button is clicked", Toast.LENGTH_SHORT).show();
            }
        });


        mFourthChipView = (ChipView) findViewById(R.id.fourth_chip_view);
        mFourthChipView.setOnChipClicked(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Fourth Chip is clicked", Toast.LENGTH_SHORT).show();
            }
        });

        mFourthChipView.setOnDeleteClicked(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Fourth Chip delete button is clicked", Toast.LENGTH_SHORT).show();
            }
        });
        mFifthChipView = (ChipView) findViewById(R.id.fifth_chip_view);

        mFifthChipView.setOnChipClicked(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Fifth Chip is clicked", Toast.LENGTH_SHORT).show();
            }
        });
        mFifthChipView.setOnDeleteClicked(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Fifth Chip delete button is clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
