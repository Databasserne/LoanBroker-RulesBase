package com.databasserne.loanbroker.controller.banks;

import com.databasserne.loanbroker.controller.IBank;

public class BankSOAP implements IBank {

    private String name;

    public BankSOAP() {}

    public BankSOAP(String name) {
        this.name = name;
    }

    public boolean isRequirementMet(int creditScore, double amount, int months) {
        if(amount > 100000) return false;
        if(creditScore < 100) return false;
        return true;
    }

    public String getName() {
        return name;
    }
}
