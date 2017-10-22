package com.databasserne.loanbroker.webservices;

import com.databasserne.loanbroker.controller.BankController;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.List;

@WebService(endpointInterface = "com.databasserne.loanbroker.webservices.RulesService")
public class RulesService implements IRules {

    private BankController bankController;
    private Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public RulesService() {
        this.bankController = new BankController();
    }

    @Override
    public String getBanks(int creditScore, double amount, int months) {
        return gson.toJson(bankController.getBanks(creditScore, amount, months));
    }
}
