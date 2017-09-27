package com.databasserne.loanbroker.controller;

public class BankJSON implements IBank {

    private String name;

    public BankJSON(String name) {
        this.name = name;
    }

    public boolean isRequirementMet(int creditScore, double amount, int months) {
        return true;
    }

    public String getName() {
        return name;
    }
}
