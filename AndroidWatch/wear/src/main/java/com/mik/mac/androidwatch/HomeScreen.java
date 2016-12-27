package com.mik.mac.androidwatch;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.view.View;
import android.widget.ImageButton;

import com.mik.mac.accounts.AccountsListActivity;

/**
 * Created by mac on 12/23/16.
 */
public class HomeScreen extends WearableActivity {

    ImageButton account;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);


        account = (ImageButton) findViewById(R.id.account);
        account.setClickable(true);
        account.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try
                {

                    Intent intent = new Intent(HomeScreen.this,AccountsListActivity.class);
                    startActivity(intent);
                    //finish();

                } catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        });


    }
}
