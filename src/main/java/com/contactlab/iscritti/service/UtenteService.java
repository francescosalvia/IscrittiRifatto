package com.contactlab.iscritti.service;

import com.contactlab.iscritti.dao.DaoGeneral;
import com.contactlab.iscritti.data.UtenteCopyDb;
import com.contactlab.iscritti.data.UtenteDb;
import com.contactlab.iscritti.metod.MetodiUtili;
import com.contactlab.iscritti.properties.UtenteProperties;
import com.contactlab.iscritti.repository.UtentiCopyRepository;
import com.contactlab.iscritti.repository.UtentiPageRepository;
import com.contactlab.iscritti.repository.UtentiRepository;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
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
        long start = System.currentTimeMillis();

        logger.info("leggo tutto");

        daoGeneral.importAll();

        logger.info("File importato nel db");

        long end = System.currentTimeMillis();
        long time = end - start;
        logger.info("Method modifyTable execution lasted:" + time + " ms");
    }


    public void modifyTable() {

        long start = System.currentTimeMillis();

        Pageable pageable = PageRequest.of(1, 100);

        List<UtenteDb> lista = utentiPageRepository.findAllByProcessed(0, pageable);

        while (lista.size() != 0) {

            logger.info("Method modifyTable execution started ");

            for (int i = 0; i < lista.size(); i++) {

                UtenteDb utenteDb = lista.get(i);

                transactionService.modifyUtenteTable(utenteDb);
            }



            lista = utentiPageRepository.findAllByProcessed(0, pageable);

        }

        long end = System.currentTimeMillis();
        long time = end - start;
        logger.info("Method modifyTable execution lasted:" + time + " ms");
    }




    public void out() {

        long start = System.currentTimeMillis();

        logger.info("Metodo salvataggio file csv");

        LocalDateTime data = LocalDateTime.now();

        String composizione = "customer_" + data.getDayOfMonth() + data.getMonthValue() + data.getYear() + "_" + data.getHour() + data.getMinute() + data.getSecond();

        String name = "'/mnt/c/Users/francesco.salvia/Desktop/iscrittiRifatto/" + composizione + ".csv'";

        String url = utenteProperties.getHeader() + utenteProperties.getCol() + name + utenteProperties.getDesc();

        try {
            daoGeneral.outAll(url);
        } catch (Exception e) {
            logger.warn(" ");
        }

        logger.info("Salvataggio effettuato!");
        
        long end = System.currentTimeMillis();
        long time = end - start;
        logger.info("Method modifyTable execution lasted:" + time + " ms");
    }


}