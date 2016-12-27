package com.mik.mac.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import com.mik.mac.Models.AccountSummaryModel;
import com.mik.mac.androidwatch.R;

import java.util.ArrayList;

/**
 * Created by ios on 12/25/16.
 */
public class AccountSummaryAdapter extends BaseAdapter {

    ArrayList<AccountSummaryModel> list;
    LayoutInflater inflater;
    Context context;

    public AccountSummaryAdapter(ArrayList<AccountSummaryModel> list, LayoutInflater inflater, Context context) {
        this.list = list;
        this.inflater = inflater;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup)
    {
        View v = inflater.inflate(R.layout.account_summary_adapter,null);
        AccountSummaryModel item=list.get(i);

        TextView AccNumber = (TextView) v.findViewById(R.id.textViewAccountNumber);
        TextView AccAmount = (TextView) v.findViewById(R.id.textView3);
        TextView AccAmount2 = (TextView) v.findViewById(R.id.textView4);
        ImageView flag = (ImageView) v.findViewById(R.id.imageViewFlag);

        AccNumber.setText( "xxxx xx"+item.getAccNUmber());
        AccAmount.setText( item.getAccAmount()+" KWD");
        AccAmount2.setText(item.getAccAmount()+" KWD");


        return v;
    }
}
