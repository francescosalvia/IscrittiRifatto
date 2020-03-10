package com.contactlab.iscritti.metod;

import com.contactlab.iscritti.dao.DaoGeneral;
import com.contactlab.iscritti.data.UtenteCopyDb;
import com.contactlab.iscritti.data.UtenteDb;
import com.contactlab.iscritti.properties.UtenteProperties;
import com.contactlab.iscritti.repository.UtentiCopyRepository;
import com.contactlab.iscritti.repository.UtentiPageRepository;
import com.contactlab.iscritti.repository.UtentiRepository;
import com.contactlab.iscritti.service.UtenteService;
import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.sql.Date;

public class MetodiUtili {




    @Autowired
    private UtentiRepository utentiRepository;

    @Autowired
    private UtentiCopyRepository utentiCopyRepository;



    private static final Logger logger = LoggerFactory.getLogger(MetodiUtili.class);


    public static Date createDate(String day, String month, String year) {

        String date = year + "-" + month + "-" + day;

        return java.sql.Date.valueOf(date);


    }

    public static String isValid(String tel) {

        try {
            PhoneNumberUtil phoneUtil = PhoneNumberUtil.getInstance();


            Phonenumber.PhoneNumber mobileTelefono = phoneUtil.parse(tel, "IT");

            if (phoneUtil.isValidNumber(mobileTelefono)) {

                tel = phoneUtil.format(mobileTelefono, PhoneNumberUtil.PhoneNumberFormat.E164);

                logger.info("telefono verificato!");

                return tel;
            } else {
                logger.info("telefono non verificato");
            }
        } catch (NumberParseException e) {
            logger.warn("is valid exception Number", e);
        }
        return tel;
    }










}
