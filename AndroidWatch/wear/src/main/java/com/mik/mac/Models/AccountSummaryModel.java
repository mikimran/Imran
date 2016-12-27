package com.mik.mac.Models;

import java.io.Serializable;

/**
 * Created by ios on 12/25/16.
 */
public class AccountSummaryModel implements Serializable {
    int AccNUmber;
    int AccBalance;
    int AccAmount;

    public AccountSummaryModel(int accNUmber, int accBalance, int accAmount) {
        AccNUmber = accNUmber;
        AccBalance = accBalance;
        AccAmount = accAmount;
    }

    public String getAccNUmber() {
        return AccNUmber+"";
    }

    public void setAccNUmber(int accNUmber) {
        AccNUmber = accNUmber;
    }

    public String getAccBalance() {
        return AccBalance+"";
    }

    public void setAccBalance(int accBalance) {
        AccBalance = accBalance;
    }

    public String getAccAmount() {
        return AccAmount+"";
    }

    public void setAccAmount(int accAmount) {
        AccAmount = accAmount;
    }
}
