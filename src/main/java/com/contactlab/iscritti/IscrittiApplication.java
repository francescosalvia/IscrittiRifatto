package com.contactlab.iscritti;

import com.contactlab.iscritti.data.Utente;
import com.contactlab.iscritti.service.UtenteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class IscrittiApplication {

    private static final Logger logger = LoggerFactory.getLogger(IscrittiApplication.class);

    public static void main(String[] args) {

        SpringApplication.run(IscrittiApplication.class, args);

/*        UtenteService utenteService = new UtenteService();

        List<Utente> l = utenteService.readUtenteFromCSV();

        for (Utente utente : l) {
            logger.info(utente.toString());
        }*/






    }

}
