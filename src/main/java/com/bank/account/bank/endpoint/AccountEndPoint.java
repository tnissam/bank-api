package com.bank.account.bank.endpoint;

import com.bank.account.bank.config.EndPointEnum;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;

import static com.bank.account.bank.config.Operations.DEPOSIT;


@RestController
public class AccountEndPoint {

    @RequestMapping(DEPOSIT)
    @GET
    public void deposit(){

    }

    @RequestMapping(DEPOSIT)
    public void withdraw(){

    }


}
