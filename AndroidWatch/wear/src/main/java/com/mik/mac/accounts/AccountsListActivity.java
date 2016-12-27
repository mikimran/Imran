package com.mik.mac.accounts;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.wearable.activity.WearableActivity;
import android.widget.ListView;

import com.mik.mac.Adapters.AccountSummaryAdapter;
import com.mik.mac.Models.AccountSummaryModel;
import com.mik.mac.androidwatch.R;
import com.mik.mac.androidwatch.WatchMainActivity;

import java.util.ArrayList;

/**
 * Created by ios on 12/25/16.
 */
public class AccountsListActivity extends WearableActivity {
    private AlarmManager mAmbientStateAlarmManager;
    private PendingIntent mAmbientStatePendingIntent;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        setAmbientEnabled();


        // preparing the alarm manager
        mAmbientStateAlarmManager =
                (AlarmManager) getSystemService(Context.ALARM_SERVICE);
        Intent ambientStateIntent =
                new Intent(getApplicationContext(), WatchMainActivity.class);

        mAmbientStatePendingIntent = PendingIntent.getActivity(
                getApplicationContext(),
                0,
                ambientStateIntent,
                PendingIntent.FLAG_UPDATE_CURRENT);
        /////////////////////////////////////
        super.onCreate(savedInstanceState);
        setContentView(R.layout.accounts_list_layout);

        final ListView lv = (ListView) findViewById(R.id.listViewAccounts);

        ArrayList<AccountSummaryModel> list = new ArrayList<>();
        for (int i=0;i<5;i++){
            AccountSummaryModel tmp = new AccountSummaryModel(11+i,233+i,121+i);
            list.add(tmp);
        }

        AccountSummaryAdapter adapter = new AccountSummaryAdapter(list,getLayoutInflater(),AccountsListActivity.this);
        lv.setAdapter(adapter);

    }
}


