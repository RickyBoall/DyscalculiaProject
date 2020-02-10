package com.example.dyscalculiaproject;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import java.util.Map;
import java.util.TreeMap;

public class SectionSelect extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_section_select);
    }

    public void matchBlockOnClick(View v){
        Intent i = new Intent(this, CountBlock.class);
        startActivity(i);
    }

    public void numArrangeOnClick(View v){
        Intent i = new Intent(this, GreatestToLeast.class);
        startActivity(i);
    }

    public void chooseNum(View v){
        Intent i = new Intent(this, Matching.class);
        startActivity(i);
    }
/*
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<String, Integer>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);


    }*/
}
