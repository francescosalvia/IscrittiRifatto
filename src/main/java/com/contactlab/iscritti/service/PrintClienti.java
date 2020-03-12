package com.contactlab.iscritti.service;


import com.contactlab.iscritti.data.UtenteDb;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PrintClienti implements Runnable{

    @Autowired
    private TransactionService transactionService;

    private static final Logger logger = LoggerFactory.getLogger(PrintClienti.class);

    private UtenteDb utenteDb;

    public UtenteDb getUtenteDb() {
        return utenteDb;
    }

    public void setUtenteDb(UtenteDb utenteDb) {
        this.utenteDb = utenteDb;
    }

    @Override
    public void run() {

        logger.info("sono in run");

        transactionService.modifyUtenteTable(utenteDb);


    }

}
