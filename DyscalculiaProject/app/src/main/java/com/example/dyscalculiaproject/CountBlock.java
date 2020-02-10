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
import android.widget.Toast;

public class CountBlock extends Activity {
    public int levelNum = 0;
    public int random = 0;
    public int counter = 0;
    Toast toast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_count_block);
        init();
        setNum();
    }
    public void setNum(){
        if(LevelSelect.getLevel() == 1){
            /*Context context = getApplicationContext();
            CharSequence text = "Hello toast!";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();*/
        }

    }

    public void submit(View v){
        try {
            toast.cancel();
        }
        catch (Exception e){

        }
        RadioButton[] radioButtons = {findViewById(R.id.rb1), findViewById(R.id.rb2), findViewById(R.id.rb3), findViewById(R.id.rb4), findViewById(R.id.rb5)};

        for(int x = 0; x <= radioButtons.length - 1; x++){
            if(radioButtons[x].isChecked() && (random  + 1)== (Integer.parseInt(radioButtons[x].getText().toString()))){
               // if(random  == Integer.parseInt(radioButtons[x].getText().toString())){
                    Context context = getApplicationContext();
                    CharSequence text = "Good job!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                    if(counter > 3) {
                        finish();
                    }
                    counter++;
                init();

                break;

                //  }
            }
            else{
                if(x == radioButtons.length - 1) {
                    //Boolean something = radioButtons[0].isSelected();
                    Context context = getApplicationContext();
                    CharSequence text = "Please try again!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                //x = radioButtons.length;

            }

        }

    }

    public void init(){ //Sets buttons to visible/invisible
        View[] buttonList = {findViewById(R.id.button1), findViewById(R.id.button2), findViewById(R.id.button3), findViewById(R.id.button4), findViewById(R.id.button5)};

        for(int i = 0; i <= random; i++){
            View button = buttonList[i];
            button.setVisibility(View.INVISIBLE);
        }
        random = (int)(Math.random()*6 - 1);

        if(random == 0){
            random = 1;
        }

        for(int i = 0; i <= random; i++){
            View button = buttonList[i];
            button.setVisibility(View.VISIBLE);
        }

    }

    @Override
    public void onBackPressed(){
        finish();
    }

    public static void main(String[] args) {
        for(int x = 0; x < 20; x++) {
            int random = (int) (Math.random() * 6);

            if (random == 0) {
                random = 1;
            }
            System.out.println(random);
        }
    }

}
