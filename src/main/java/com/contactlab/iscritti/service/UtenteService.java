package com.contactlab.iscritti.service;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;
import com.contactlab.iscritti.dao.DaoGeneral;
import com.contactlab.iscritti.data.UtenteCopyDb;
import com.contactlab.iscritti.data.UtenteDb;
import com.contactlab.iscritti.properties.UtenteProperties;
import com.contactlab.iscritti.repository.UtentiCopyRepository;
import com.contactlab.iscritti.repository.UtentiRepository;
import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.io.*;
import java.sql.Date;
import java.util.ArrayList;
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
    private DaoGeneral daoGeneral;


    /**
     * METODI UTILI
     **/

    public Date createDate(String day, String month, String year) {

        String date = year + "-" + month + "-" + day;

        return java.sql.Date.valueOf(date);


    }


    public String isValid(String tel) {

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


    /******************************************************************************************************************/

    public void readAll() {
        logger.info("leggo tutto");
        //      utentiCopyRepository.bulkLoadData();
        daoGeneral.importAll();

    }


    public void modifyTable() {


        List<UtenteDb> lista = utentiRepository.findTop100ByProcessed(0);

        while (lista.size() != 0) {

            for (int i = 0; i < lista.size(); i++) {

                UtenteCopyDb utenteCopyDb = new UtenteCopyDb();

                UtenteDb utenteDb = lista.get(i);

                utenteCopyDb.setId(utenteDb.getProgressiveId());

                utenteCopyDb.setUid(utenteDb.getUid());
                utenteCopyDb.setEmail(utenteDb.getEmail());
                utenteCopyDb.setAge(utenteDb.getAge());

                String day = utenteDb.getBirthday();
                String month = utenteDb.getBirthmonth();
                String year = utenteDb.getBirthyear();

                if (StringUtils.isNotBlank(day) && StringUtils.isNotBlank(month) && StringUtils.isNotBlank(year)) {
                    utenteCopyDb.setDob(createDate(day, month, year));

                }

                utenteCopyDb.setCity(utenteDb.getCity());
                utenteCopyDb.setCountry(utenteDb.getCountry());
                utenteCopyDb.setFirstname(utenteDb.getFirstname());
                utenteCopyDb.setLastname(utenteDb.getLastname());
                utenteCopyDb.setGender(utenteDb.getGender());
                utenteCopyDb.setZip(utenteDb.getZip());
                utenteCopyDb.setCodProvince(utenteDb.getCodProvince());

                utenteCopyDb.setDvDesktopCount(utenteDb.getDvDesktopCount());
                utenteCopyDb.setDvDesktopLast(utenteDb.getDvDesktopLast());
                utenteCopyDb.setDvMobileCount(utenteDb.getDvMobileCount());
                utenteCopyDb.setDvMobileLast(utenteDb.getDvMobileLast());
                utenteCopyDb.setDvTabletCount(utenteDb.getDvTabletCount());
                utenteCopyDb.setDvTabletLast(utenteDb.getDvTabletLast());

                utenteCopyDb.setLastlogindate(utenteDb.getLastLoginDate());


                String mobilephone = utenteDb.getMobilephone();

                if (mobilephone.contains("+39")) {

                    utenteCopyDb.setMobilephone(mobilephone);

                } else {

                    if (StringUtils.isNotBlank(mobilephone)) {

                        String mobilephoneSistemato = isValid(mobilephone);

                        if (!mobilephoneSistemato.equalsIgnoreCase(utenteDb.getMobilephone())) {
                            utenteCopyDb.setMobilephone(mobilephoneSistemato);
                        }

                    } else {
                        utenteCopyDb.setMobilephone(" ");
                    }
                }

                utenteCopyDb.setPrBauli(utenteDb.getPrBauli());
                utenteCopyDb.setPrMotta(utenteDb.getPrMotta());
                utenteCopyDb.setPrBuondi(utenteDb.getPrBuondi());
                utenteCopyDb.setPrGirella(utenteDb.getPrGirella());
                utenteCopyDb.setPrYoyo(utenteDb.getPrYoyo());
                utenteCopyDb.setPrCiocori(utenteDb.getPrCiocori());
                utenteCopyDb.setPrDoria(utenteDb.getPrDoria());
                utenteCopyDb.setPrBistefani(utenteDb.getPrBistefani());
                utenteCopyDb.setPrAlemagna(utenteDb.getPrAlemagna());
                utenteCopyDb.setPrCasalini(utenteDb.getPrCasalini());
                utenteCopyDb.setPrBauligroup(utenteDb.getPrBauligroup());

                utenteCopyDb.setPreferred_retailer(utenteDb.getPreferredRetailer());
                utenteCopyDb.setPrivacy_profiling(utenteDb.getPrivacyProfiling());
                utenteCopyDb.setPrivacy_recall(utenteDb.getPrivacyRecall());
                utenteCopyDb.setRegistration_initiative(utenteDb.getRegistrationInitiative());

                String telephone = utenteDb.getTelephone();

                if (telephone.contains("+39")) {
                    utenteCopyDb.setTelephone(telephone);
                } else {

                    if (StringUtils.isNotBlank(telephone)) {

                        String telephoneSistemato = isValid(telephone);

                        if (!telephoneSistemato.equalsIgnoreCase(utenteDb.getTelephone())) {
                            utenteCopyDb.setTelephone(telephoneSistemato);
                        }

                    } else {
                        utenteCopyDb.setTelephone(" ");
                    }
                }

                utenteCopyDb.setIs_active(utenteDb.getIsActive());
                utenteCopyDb.setIs_registered(utenteDb.getIsRegistered());
                utenteCopyDb.setIs_verified(utenteDb.getIsVerified());
                utenteCopyDb.setLogin_provider(utenteDb.getLoginProvider());
                utenteCopyDb.setSocial_providers(utenteDb.getSocialProviders());
                utenteCopyDb.setStatus_user(utenteDb.getStatusUser());
                utenteCopyDb.setAddress(utenteDb.getAddress());

                utenteCopyDb.setCategory_index_biscuits(utenteDb.getCategoryIndexBiscuits());
                utenteCopyDb.setCategory_index_minicakes(utenteDb.getCategoryIndexMinicakes());
                utenteCopyDb.setCategory_index_savoury(utenteDb.getCategoryIndexSavoury());
                utenteCopyDb.setCategory_index_seasonal(utenteDb.getCategoryIndexSeasonal());
                utenteCopyDb.setTaste_index_chocolover(utenteDb.getTasteIndexChocolover());
                utenteCopyDb.setTaste_index_creamlover(utenteDb.getTasteIndexCreamlover());
                utenteCopyDb.setTaste_index_fillinglover(utenteDb.getTasteIndexFillinglover());
                utenteCopyDb.setTaste_index_fruitlover(utenteDb.getTasteIndexFruitlover());
                utenteCopyDb.setTaste_index_plainlover(utenteDb.getTasteIndexPlainlover());
                utenteCopyDb.setTaste_index_savourylover(utenteDb.getTasteIndexSavourylover());
                utenteCopyDb.setLast_update_date(utenteDb.getLastUpdateDate());
                utenteCopyDb.setOptin_date(utenteDb.getOptinDate());
                utenteCopyDb.setPrivacy_store(utenteDb.getPrivacyStore());
                utenteCopyDb.setRegistation_date(utenteDb.getRegistationDate());
                utenteCopyDb.setValassis_uid(utenteDb.getValassisUid());
                utenteCopyDb.setProcessed(0);

                utentiCopyRepository.save(utenteCopyDb);

                logger.info("Utente copia salvato");

                utenteDb.setProcessed(1);

                utentiRepository.save(utenteDb);

                logger.info("Utente aggiornato con processed 1");
            }


            lista = utentiRepository.findTop100ByProcessed(0);

        }
    }

    public void scrivi() {

        logger.info("Metodo scrivi file csv");

        List<String[]> lista = creaStringa();


        String[] header = new String[]{
                "UID", "EMAIL", "AGE", "DOB", "CITY", "COUNTRY", "FIRSTNAME", "LASTNAME", "GENDER",
                "ZIP", "CODPROVINCE", "DV_DESKTOPCOUNT", "DV_DESKTOPLAST", "DV_MOBILECOUNT", "DV_MOBILELAST", "DV_TABLETCOUNT",
                "DV_TABLETLAST", "LASTLOGINDATE", "MOBILEPHONE", "PR_BAULI", "PR_MOTTA", "PR_BUONDI", "PR_GIRELLA", "PR_YOYO",
                "PR_CIOCORI", "PR_DORIA", "PR_BISTEFANI", "PR_ALEMAGNA", "PR_CASALINI", "PR_BAULIGROUP", "PREFERREDRETAILER",
                "PRIVACYPROFILING", "PRIVACYRECALL", "REGISTRATIONINITIATIVE", "TELEPHONE", "ISACTIVE", "ISREGISTERED", "ISVERIFIED",
                "LOGINPROVIDER", "SOCIALPROVIDERS", "STATUSUSER", "ADDRESS", "CATEGORYINDEX_BISCUITS", "CATEGORYINDEX_MINICAKES",
                "CATEGORYINDEX_SAVOURY", "CATEGORYINDEX_SEASONAL", "TASTEINDEX_CHOCOLOVER", "TASTEINDEX_CREAMLOVER", "TASTEINDEX_FILLINGLOVER",
                "TASTEINDEX_FRUITLOVER", "TASTEINDEX_PLAINLOVER", "TASTEINDEX_SAVOURYLOVER", "LASTUPDATEDDATE", "OPTINDATE", "PRIVACYSTORE", "REGISTRATIONDATE", "VALASSIS_UID"
        };

        String csvFile = utenteProperties.getUrlWrite();

        try {
            CSVWriter csvWriter = new CSVWriter(new FileWriter(csvFile, true), ',', '"');

            BufferedReader br = new BufferedReader(new FileReader(utenteProperties.getUrlWrite()));
            if (br.readLine() == null) {
                logger.info("File vuoto aggiungo header");
                csvWriter.writeNext(header);
            }

            csvWriter.writeAll(lista);

            csvWriter.close();

        } catch (IOException e) {
            logger.warn("IOException nel metodo scrivi", e);
        }
    }


    public void out() {
         daoGeneral.outAll();



    }


    public List<String[]> creaStringa() {

        logger.info("Metodo crea Stringa");

        List<String[]> lista = new ArrayList<>();

        List<UtenteCopyDb> utenteCopyDb = utentiCopyRepository.findAllByProcessed(0);

        for (int i = 0; i < utenteCopyDb.size(); i++) {
            UtenteCopyDb u = utenteCopyDb.get(i);
            String[] str = new String[]{

                    u.getUid(), u.getEmail(), u.getAge(), String.valueOf(u.getDob()), u.getCity(), u.getCountry(), u.getFirstname(), u.getLastname(), u.getGender(),
                    u.getZip(), u.getCodProvince(), u.getDvDesktopCount(), u.getDvDesktopLast(), u.getDvMobileCount(), u.getDvMobileLast(),
                    u.getDvTabletCount(), u.getDvTabletLast(), u.getLastlogindate(), u.getMobilephone(), u.getPrBauli(), u.getPrMotta(), u.getPrBuondi(),
                    u.getPrGirella(), u.getPrYoyo(), u.getPrCiocori(), u.getPrDoria(), u.getPrBistefani(), u.getPrAlemagna(), u.getPrCasalini(),
                    u.getPrBauligroup(), u.getPreferred_retailer(), u.getPrivacy_profiling(), u.getPrivacy_recall(), u.getRegistration_initiative(),
                    u.getTelephone(), u.getIs_active(), u.getIs_registered(), u.getIs_verified(), u.getLogin_provider(), u.getSocial_providers(), u.getStatus_user(),
                    u.getAddress(), u.getCategory_index_biscuits(), u.getCategory_index_minicakes(), u.getCategory_index_savoury(), u.getCategory_index_seasonal(),
                    u.getTaste_index_chocolover(), u.getTaste_index_creamlover(), u.getTaste_index_fillinglover(), u.getTaste_index_fruitlover(), u.getTaste_index_plainlover(),
                    u.getTaste_index_savourylover(), u.getLast_update_date(), u.getOptin_date(), u.getPrivacy_store(), u.getRegistation_date(), u.getValassis_uid()
            };

            u.setProcessed(1);
            utentiCopyRepository.save(u);

            lista.add(str);
        }

        return lista;

    }


}