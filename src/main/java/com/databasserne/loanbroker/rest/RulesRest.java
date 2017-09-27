package com.databasserne.loanbroker.rest;

import com.databasserne.loanbroker.controller.BankController;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/banks")
public class RulesRest {

    private Gson gson = new GsonBuilder().setPrettyPrinting().create();
    private BankController bankController;

    public RulesRest() {
        bankController = new BankController();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getBanks(@QueryParam("creditScore") int creditScore, @QueryParam("amount") double amount, @QueryParam("months") int months) {
        return Response.status(Response.Status.OK).entity(gson.toJson(bankController.getBanks(creditScore, amount, months))).build();
    }
}
