package com.databasserne.loanbroker.controller;

import com.databasserne.loanbroker.controller.banks.BankJSON;
import com.databasserne.loanbroker.controller.banks.BankNODE;
import com.databasserne.loanbroker.controller.banks.BankSOAP;
import com.databasserne.loanbroker.controller.banks.BankXML;

import java.util.ArrayList;
import java.util.List;

public class BankController {

    private List<IBank> banks = new ArrayList<IBank>();

    public BankController() {
        banks.add(new BankJSON("BankJSON"));
        banks.add(new BankXML("BankXML"));
        banks.add(new BankSOAP("BankSOAP"));
        banks.add(new BankNODE("BankNODE"));
    }

    public List<String> getBanks(int creditScore, double amount, int months) {
        List<String> bankNames = new ArrayList<String>();
        for(IBank bank : banks) {
            if(bank.isRequirementMet(creditScore, amount, months)) {
                bankNames.add(bank.getName());
            }
        }

        return bankNames;
    }
}
