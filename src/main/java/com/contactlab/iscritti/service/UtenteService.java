package com.contactlab.iscritti.service;

import com.contactlab.iscritti.dao.DaoGeneral;
import com.contactlab.iscritti.data.UtenteDb;
import com.contactlab.iscritti.properties.UtenteProperties;
import com.contactlab.iscritti.repository.UtentiCopyRepository;
import com.contactlab.iscritti.repository.UtentiPageRepository;
import com.contactlab.iscritti.repository.UtentiRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.List;


@Service
public class UtenteService {

    private static final Logger logger = LoggerFactory.getLogger(UtenteService.class);

    @Autowired
    private UtenteProperties utenteProperties;

    @Autowired
    private UtentiRepository utentiRepository;

    @Autowired
    private UtentiCopyRepository utentiCopyRepository;

    @Autowired
    private UtentiPageRepository utentiPageRepository;

    @Autowired
    private DaoGeneral daoGeneral;

    @Autowired
    private  TransactionService transactionService;


    /******************************************************************************************************************/

    public void readAll() {

        Instant start = Instant.now();

        logger.info("leggo tutto");

        daoGeneral.importAll();

        logger.info("File importato nel db");

        Instant end = Instant.now();

        Duration duration = Duration.between(start, end);

        logger.info("Method modifyTable execution lasted:" + duration.toMillis() + " ms");
    }


    public void modifyTable() {
        logger.info("Method modifyTable execution started ");
        Instant start = Instant.now();

        Pageable pageable = PageRequest.of(0, 100);

        Page<UtenteDb> page = utentiPageRepository.findAllByProcessed(0, pageable);


        while (page.hasNext()) {
            List<UtenteDb> lista = page.getContent();


            for (int i = 0; i < lista.size(); i++) {

                UtenteDb utenteDb = lista.get(i);

                try {
                    transactionService.modifyUtenteTable(utenteDb);
                } catch (Exception e) {
                    logger.warn("Exception in modify Utente Table", e);
                }

            }
        }

        Instant end = Instant.now();

        Duration duration = Duration.between(start, end);

        logger.info("Method modifyTable execution lasted:" + duration.toMinutes() + " min");
    }




    public void out() {

        Instant start = Instant.now();

        logger.info("Metodo salvataggio file csv");

        LocalDateTime data = LocalDateTime.now();

        String composizione = "customer_" + data.getDayOfMonth() + data.getMonthValue() + data.getYear() + "_" + data.getHour() + data.getMinute() + data.getSecond();

        String name = "'/mnt/c/Users/francesco.salvia/Desktop/iscrittiRifatto/" + composizione + ".csv'";

        String url = utenteProperties.getHeader() + utenteProperties.getCol() + name + utenteProperties.getDesc();

        try {
            daoGeneral.outAll(url);
        } catch (Exception e) {
            logger.warn("Eccezione",e.getMessage());
        }

        logger.info("Salvataggio effettuato!");

        Instant end = Instant.now();

        Duration duration = Duration.between(start, end);

        logger.info("Method modifyTable execution lasted:" + duration.toMillis() + " ms");
    }


}