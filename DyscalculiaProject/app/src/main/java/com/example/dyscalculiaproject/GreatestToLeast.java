package com.example.dyscalculiaproject;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GreatestToLeast extends Activity {
    CheckBox[] checkBoxes;
    TextView numbers;
    List<Integer> array = new ArrayList<Integer>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_greatest_to_least);
         numbers = (TextView) findViewById(R.id.numSeq);
        checkBoxes = new CheckBox[]{findViewById(R.id.cb1), findViewById(R.id.cb2), findViewById(R.id.cb3), findViewById(R.id.cb4), findViewById(R.id.cb5)};

        for(int x = 1;  x <= 5; x++){
            array.add(x);
        }
        Collections.shuffle(array);

        init();
    }

    public void init(){
        CheckBox cb1 = (CheckBox) findViewById(R.id.cb1);
        cb1.setText(String.valueOf(array.get(0)));
        CheckBox cb2 = (CheckBox) findViewById(R.id.cb2);
        cb2.setText(String.valueOf(array.get(1)));
        CheckBox cb3 = (CheckBox) findViewById(R.id.cb3);
        cb3.setText(String.valueOf(array.get(2)));
        CheckBox cb4 = (CheckBox) findViewById(R.id.cb4);
        cb4.setText(String.valueOf(array.get(3)));
        CheckBox cb5 = (CheckBox) findViewById(R.id.cb5);
        cb5.setText(String.valueOf(array.get(4)));
    }

    public void onClick1(View v){
        numbers.append("     " + array.get(0));
        checkBoxes[0].setEnabled(false);
    }

    public void onClick2(View v){
        numbers.append("     " + array.get(1));
        checkBoxes[1].setEnabled(false);

    }

    public void onClick3(View v){
        numbers.append("     " + array.get(2));
        checkBoxes[2].setEnabled(false);

    }

    public void onClick4(View v){
        numbers.append("     " + array.get(3));
        checkBoxes[3].setEnabled(false);

    }

    public void onClick5(View v){
        numbers.append("     " + array.get(4));
        checkBoxes[4].setEnabled(false);

    }

    public void reset(View v){
        for(int x = 0; x < checkBoxes.length; x++){
            checkBoxes[x].setEnabled(true);
            checkBoxes[x].setChecked(false);
        }
        numbers.setText("");
    }

    public void check(View v){
        TextView text= (TextView) findViewById(R.id.numSeq);
        String string = text.getText().toString().replaceAll(("\\s+"),"");
        boolean greater= true;

        List<Integer> arrayList = new ArrayList<Integer>();
        for(int x = 0; x < string.length(); x++){
            arrayList.add(Integer.parseInt(string.substring(x, x+1)));
        }
        /*Context context = getApplicationContext();
        CharSequence thing = String.valueOf(string.length());
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, thing, duration);
        toast.show();*/
        for(int j=0; j<(arrayList.size()); j++) {
            if (!greater || arrayList.size() != 5) {
                break;
            }
            int compare = arrayList.get(j);
            for (int k = j + 1; k < arrayList.size(); k++) {
                if (arrayList.get(j) > arrayList.get(k)) {
                    greater = true;
                } else {
                    greater = false;
                    break;
                }
            }
        }

        if(!greater || arrayList.size() != 5){
            Context context = getApplicationContext();
            CharSequence thing = "Try again!";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, thing, duration);
            toast.show();
        }
        else{
            Context context = getApplicationContext();
            CharSequence thing = "Nice!";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, thing, duration);
            toast.show();
            finish();
        }
    }


    public static void main(String[] args) {
        String string = "54321";
        boolean greater= true;
        List<Integer> arrayList = new ArrayList<Integer>();
        for(int x = 0; x < string.length(); x++){
            arrayList.add(Integer.parseInt(string.substring(x, x+1)));
        }
        for(int j=0; j<(arrayList.size()); j++)
        {
            if(!greater){
                break;
            }
            int compare = arrayList.get(j);

            for(int k = j + 1; k < arrayList.size(); k++){
                if(arrayList.get(j) > arrayList.get(k)){
                    greater = true;
                }
                else{
                    greater = false;
                    break;
                }
            }
        }
        System.out.println(greater);


    }
 }

