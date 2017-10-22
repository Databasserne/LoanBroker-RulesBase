package com.databasserne.loanbroker.controller.banks;

import com.databasserne.loanbroker.controller.IBank;

public class BankJSON implements IBank {

    private String name;

    public BankJSON(String name) {
        this.name = name;
    }

    public boolean isRequirementMet(int creditScore, double amount, int months) {
        if(creditScore < 100) return false;
        return true;
    }

    public String getName() {
        return name;
    }
}
