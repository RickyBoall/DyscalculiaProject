package com.example.dyscalculiaproject;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Map;
import java.util.TreeMap;

public class Matching extends Activity {
    int random = (int)(Math.random()*6);
    int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_matching);
        init();
    }

    public void init(){
        RadioButton[] buttons = {findViewById(R.id.rb1), findViewById(R.id.rb2), findViewById(R.id.rb3), findViewById(R.id.rb4), findViewById(R.id.rb5)};
        for(int x = 0; x < buttons.length; x++){
            if(buttons[x].isChecked()) {
                buttons[x].setChecked(false);
                }
            }
        random = (int)(Math.random()*6);
        TextView numText = (TextView)findViewById(R.id.num);
        if(random == 0){
            random = 1;
        }
        numText.setText(String.valueOf(random));
    }

    public void Check_OnClick(View v) {
        Map<String, Integer> map = new TreeMap<String, Integer>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);

        int numSelect = 0;
        RadioButton[] buttons = {findViewById(R.id.rb1), findViewById(R.id.rb2), findViewById(R.id.rb3), findViewById(R.id.rb4), findViewById(R.id.rb5)};
        for(int x = 0; x < buttons.length; x++){
            if(buttons[x].isChecked()){
                numSelect = x;
                break;
            }
        }

        if(numSelect == random-1){
            Context context = getApplicationContext();
            CharSequence thing = "Good job!!";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, thing, duration);
            toast.show();
            if(counter > 3) {
                finish();
            }
                counter++;
        }
        else{
            Context context = getApplicationContext();
            CharSequence thing = "Try again!";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, thing, duration);
            toast.show();
        }
        init();
        //System.out.println(map.get("five"));

    }

}