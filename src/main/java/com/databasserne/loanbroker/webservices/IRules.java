package com.databasserne.loanbroker.webservices;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface IRules {

    @WebMethod String getBanks(int creditScore, double amount, int months);
}
