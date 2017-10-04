package com.databasserne.loanbroker.controller.banks;

import com.databasserne.loanbroker.controller.IBank;

public class BankXML implements IBank {

    private String name;

    public BankXML(String name) {
        this.name = name;
    }

    public boolean isRequirementMet(int creditScore, double amount, int months) {
        return true;
    }

    public String getName() {
        return name;
    }
}
