package com.contactlab.iscritti.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class PrintClienti implements Runnable{

    private static final Logger logger = LoggerFactory.getLogger(PrintClienti.class);


    String name;
    String cognome;

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setName(String name){
        this.name = name;
    }
    @Override
    public void run() {

        logger.info(name + " " + cognome + " estratto dal Db");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(name + " is running after sleeping");

    }

}