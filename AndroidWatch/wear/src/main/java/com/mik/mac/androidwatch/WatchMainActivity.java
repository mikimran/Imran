package com.mik.mac.androidwatch;

import android.content.Intent;
import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.support.wearable.view.BoxInsetLayout;
import android.view.View;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

public class WatchMainActivity extends WearableActivity implements  View.OnClickListener {


    private BoxInsetLayout mContainerView;

    EditText userinput;


    Button btn[] = new Button[9];

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.athentication);
        //setAmbientEnabled();


        //register the buttons
        btn[0] = (Button)findViewById(R.id.button1);
        btn[1] = (Button)findViewById(R.id.button2);
        btn[2] = (Button)findViewById(R.id.button3);
        btn[3] = (Button)findViewById(R.id.button4);
        btn[4] = (Button)findViewById(R.id.button5);
        btn[5] = (Button)findViewById(R.id.button6);
        btn[6] = (Button)findViewById(R.id.button7);
        btn[7] = (Button)findViewById(R.id.button8);
        btn[8] = (Button)findViewById(R.id.button9);

        btn[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        //register onClick event
        for(int i =0;i<9;i++)
        {
            btn[i].setOnClickListener(this);
        }
    }

    public void onClick(View v)
    {
        switch(v.getId())
        {
            case R.id.button1:
                addtoarray("1");
                break;
            case R.id.button2:
                addtoarray("2");
                break;
            case R.id.button3:
                addtoarray("3");
                break;
            case R.id.button4:
                addtoarray("4");
                break;
            case R.id.button5:
                addtoarray("5");
                break;
            case R.id.button6:
                addtoarray("6");
                break;
            case R.id.button7:
                addtoarray("7");
                break;
            case R.id.button8:
                addtoarray("8");
                break;
            case R.id.button9:
                addtoarray("9");
                break;
            default:

        }
    }

    public void addtoarray(String numbers)
    {
        //register TextBox
        userinput = (EditText)findViewById(R.id.numberpadtext);

        if(userinput.length() <4 )
            userinput.append(numbers);
        else
        {
            Intent intent = new Intent(WatchMainActivity.this,HomeScreen.class);
            startActivity(intent);
        }
    }

}

