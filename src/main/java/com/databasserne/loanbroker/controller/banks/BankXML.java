package com.databasserne.loanbroker.controller.banks;

import com.databasserne.loanbroker.controller.IBank;

public class BankXML implements IBank {

    private String name;

    public BankXML(String name) {
        this.name = name;
    }

    public boolean isRequirementMet(int creditScore, double amount, int months) {
        if(months > 50) return false;
        if(creditScore < 600) return false;

        return true;
    }

    public String getName() {
        return name;
    }
}
