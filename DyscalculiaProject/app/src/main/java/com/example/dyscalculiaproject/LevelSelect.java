package com.example.dyscalculiaproject;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class LevelSelect extends Activity {
    static int levelNum = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_levelselect);
    }

    public void onLevel1(View v){
        Intent i = new Intent(this, SectionSelect.class);
        startActivity(i);
        levelNum = 1;

    }

    public void onLevel2(View v){
        Intent i = new Intent(this, SectionSelect.class);
        startActivity(i);
        levelNum = 2;
    }

    public void onLevel3(View v){
        Intent i = new Intent(this, SectionSelect.class);
        startActivity(i);
        levelNum = 3;
    }

    public static int getLevel(){
        return levelNum;
    }
}
