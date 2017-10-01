package com.databasserne.loanbroker;

import com.databasserne.loanbroker.webservices.RulesService;

import javax.xml.ws.Endpoint;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Endpoint.publish("http://localhost:9999/rules/banks", new RulesService());
    }
}
