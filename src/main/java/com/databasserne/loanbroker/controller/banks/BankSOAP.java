package com.databasserne.loanbroker.controller.banks;

import com.databasserne.loanbroker.controller.IBank;

public class BankSOAP implements IBank {

    private String name;

    public BankSOAP() {}

    public BankSOAP(String name) {
        this.name = name;
    }

    public boolean isRequirementMet(int creditScore, double amount, int months) {
        return true;
    }

    public String getName() {
        return name;
    }
}
