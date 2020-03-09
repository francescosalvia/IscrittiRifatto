package com.contactlab.iscritti.data;

public class Utente
{

    private int progressive_id;
    private int processed;
    private String uid;
    private String email;
    private String birthdayv;
    private String birthmonth;
    private String  birthyear;
    private String  city;
    private String   country;
    private String   firstname;
    private String   lastname;
    private String   gender;
    private String  zip;
    private String   codprovince;
    private String   dv_desktopcount;
    private String   dv_desktoplast;
    private String   dv_mobilecount;
    private String   dv_mobilelast;
    private String    dv_tabletcount;
    private String    dv_tabletlast;
    private String    lastlogindate;
    private String     mobilephone;
    private String     pr_bauli;
    private String    pr_motta;
    private String   pr_buondi;
    private String   pr_girella;
    private String    pr_yoyo;
    private String   pr_ciocori;
    private String    pr_doria;
    private String   pr_bistefani;
    private String   pr_alemagna;
    private String   pr_casalini;
    private String   pr_bauligroup;
    private String    preferred_retailer;
    private String  privacy_profiling;
    private String   privacy_recall;
    private String  registration_initiative;
    private String  telephone;
    private String    is_active;
    private String     is_registered;
    private String    is_verified;
    private String    login_provider;
    private String     social_providers;
    private String     status_user;
    private String     address;
    private String     category_index_biscuits;
    private String    category_index_minicakes;
    private String   category_index_savoury;
    private String    category_index_seasonal;
    private String  taste_index_chocolover;
    private String   taste_index_creamlover;
    private String   taste_index_fillinglover;
    private String   taste_index_fruitlover;
    private String    taste_index_plainloverv;
    private String   taste_index_savourylover;
    private String   last_update_date;
    private String   optin_date;
    private String   privacy_store;
    private String    registation_date;
    private String  valassis_uid;


    public Utente(int processed, String uid, String email, String birthdayv, String birthmonth, String birthyear, String city,
                  String country, String firstname, String lastname, String gender, String zip,
                  String codprovince, String dv_desktopcount, String dv_desktoplast, String dv_mobilecount,
                  String dv_mobilelast, String dv_tabletcount, String dv_tabletlast, String lastlogindate,
                  String mobilephone, String pr_bauli, String pr_motta, String pr_buondi, String pr_girella,
                  String pr_yoyo, String pr_ciocori, String pr_doria, String pr_bistefani, String pr_alemagna,
                  String pr_casalini, String pr_bauligroup, String preferred_retailer, String privacy_profiling,
                  String privacy_recall, String registration_initiative, String telephone, String is_active,
                  String is_registered, String is_verified, String login_provider, String social_providers,
                  String status_user, String address, String category_index_biscuits, String category_index_minicakes,
                  String category_index_savoury, String category_index_seasonal, String taste_index_chocolover,
                  String taste_index_creamlover, String taste_index_fillinglover, String taste_index_fruitlover,
                  String taste_index_plainloverv, String taste_index_savourylover, String last_update_date,
                  String optin_date, String privacy_store, String registation_date, String valassis_uid) {

        this.processed = processed;
        this.uid = uid;
        this.email = email;
        this.birthdayv = birthdayv;
        this.birthmonth = birthmonth;
        this.birthyear = birthyear;
        this.city = city;
        this.country = country;
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.zip = zip;
        this.codprovince = codprovince;
        this.dv_desktopcount = dv_desktopcount;
        this.dv_desktoplast = dv_desktoplast;
        this.dv_mobilecount = dv_mobilecount;
        this.dv_mobilelast = dv_mobilelast;
        this.dv_tabletcount = dv_tabletcount;
        this.dv_tabletlast = dv_tabletlast;
        this.lastlogindate = lastlogindate;
        this.mobilephone = mobilephone;
        this.pr_bauli = pr_bauli;
        this.pr_motta = pr_motta;
        this.pr_buondi = pr_buondi;
        this.pr_girella = pr_girella;
        this.pr_yoyo = pr_yoyo;
        this.pr_ciocori = pr_ciocori;
        this.pr_doria = pr_doria;
        this.pr_bistefani = pr_bistefani;
        this.pr_alemagna = pr_alemagna;
        this.pr_casalini = pr_casalini;
        this.pr_bauligroup = pr_bauligroup;
        this.preferred_retailer = preferred_retailer;
        this.privacy_profiling = privacy_profiling;
        this.privacy_recall = privacy_recall;
        this.registration_initiative = registration_initiative;
        this.telephone = telephone;
        this.is_active = is_active;
        this.is_registered = is_registered;
        this.is_verified = is_verified;
        this.login_provider = login_provider;
        this.social_providers = social_providers;
        this.status_user = status_user;
        this.address = address;
        this.category_index_biscuits = category_index_biscuits;
        this.category_index_minicakes = category_index_minicakes;
        this.category_index_savoury = category_index_savoury;
        this.category_index_seasonal = category_index_seasonal;
        this.taste_index_chocolover = taste_index_chocolover;
        this.taste_index_creamlover = taste_index_creamlover;
        this.taste_index_fillinglover = taste_index_fillinglover;
        this.taste_index_fruitlover = taste_index_fruitlover;
        this.taste_index_plainloverv = taste_index_plainloverv;
        this.taste_index_savourylover = taste_index_savourylover;
        this.last_update_date = last_update_date;
        this.optin_date = optin_date;
        this.privacy_store = privacy_store;
        this.registation_date = registation_date;
        this.valassis_uid = valassis_uid;
    }

    public int getProgressive_id() {
        return progressive_id;
    }

    public void setProgressive_id(int progressive_id) {
        this.progressive_id = progressive_id;
    }

    public int getProcessed() {
        return processed;
    }

    public void setProcessed(int processed) {
        this.processed = processed;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthdayv() {
        return birthdayv;
    }

    public void setBirthdayv(String birthdayv) {
        this.birthdayv = birthdayv;
    }

    public String getBirthmonth() {
        return birthmonth;
    }

    public void setBirthmonth(String birthmonth) {
        this.birthmonth = birthmonth;
    }

    public String getBirthyear() {
        return birthyear;
    }

    public void setBirthyear(String birthyear) {
        this.birthyear = birthyear;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCodprovince() {
        return codprovince;
    }

    public void setCodprovince(String codprovince) {
        this.codprovince = codprovince;
    }

    public String getDv_desktopcount() {
        return dv_desktopcount;
    }

    public void setDv_desktopcount(String dv_desktopcount) {
        this.dv_desktopcount = dv_desktopcount;
    }

    public String getDv_desktoplast() {
        return dv_desktoplast;
    }

    public void setDv_desktoplast(String dv_desktoplast) {
        this.dv_desktoplast = dv_desktoplast;
    }

    public String getDv_mobilecount() {
        return dv_mobilecount;
    }

    public void setDv_mobilecount(String dv_mobilecount) {
        this.dv_mobilecount = dv_mobilecount;
    }

    public String getDv_mobilelast() {
        return dv_mobilelast;
    }

    public void setDv_mobilelast(String dv_mobilelast) {
        this.dv_mobilelast = dv_mobilelast;
    }

    public String getDv_tabletcount() {
        return dv_tabletcount;
    }

    public void setDv_tabletcount(String dv_tabletcount) {
        this.dv_tabletcount = dv_tabletcount;
    }

    public String getDv_tabletlast() {
        return dv_tabletlast;
    }

    public void setDv_tabletlast(String dv_tabletlast) {
        this.dv_tabletlast = dv_tabletlast;
    }

    public String getLastlogindate() {
        return lastlogindate;
    }

    public void setLastlogindate(String lastlogindate) {
        this.lastlogindate = lastlogindate;
    }

    public String getMobilephone() {
        return mobilephone;
    }

    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone;
    }

    public String getPr_bauli() {
        return pr_bauli;
    }

    public void setPr_bauli(String pr_bauli) {
        this.pr_bauli = pr_bauli;
    }

    public String getPr_motta() {
        return pr_motta;
    }

    public void setPr_motta(String pr_motta) {
        this.pr_motta = pr_motta;
    }

    public String getPr_buondi() {
        return pr_buondi;
    }

    public void setPr_buondi(String pr_buondi) {
        this.pr_buondi = pr_buondi;
    }

    public String getPr_girella() {
        return pr_girella;
    }

    public void setPr_girella(String pr_girella) {
        this.pr_girella = pr_girella;
    }

    public String getPr_yoyo() {
        return pr_yoyo;
    }

    public void setPr_yoyo(String pr_yoyo) {
        this.pr_yoyo = pr_yoyo;
    }

    public String getPr_ciocori() {
        return pr_ciocori;
    }

    public void setPr_ciocori(String pr_ciocori) {
        this.pr_ciocori = pr_ciocori;
    }

    public String getPr_doria() {
        return pr_doria;
    }

    public void setPr_doria(String pr_doria) {
        this.pr_doria = pr_doria;
    }

    public String getPr_bistefani() {
        return pr_bistefani;
    }

    public void setPr_bistefani(String pr_bistefani) {
        this.pr_bistefani = pr_bistefani;
    }

    public String getPr_alemagna() {
        return pr_alemagna;
    }

    public void setPr_alemagna(String pr_alemagna) {
        this.pr_alemagna = pr_alemagna;
    }

    public String getPr_casalini() {
        return pr_casalini;
    }

    public void setPr_casalini(String pr_casalini) {
        this.pr_casalini = pr_casalini;
    }

    public String getPr_bauligroup() {
        return pr_bauligroup;
    }

    public void setPr_bauligroup(String pr_bauligroup) {
        this.pr_bauligroup = pr_bauligroup;
    }

    public String getPreferred_retailer() {
        return preferred_retailer;
    }

    public void setPreferred_retailer(String preferred_retailer) {
        this.preferred_retailer = preferred_retailer;
    }

    public String getPrivacy_profiling() {
        return privacy_profiling;
    }

    public void setPrivacy_profiling(String privacy_profiling) {
        this.privacy_profiling = privacy_profiling;
    }

    public String getPrivacy_recall() {
        return privacy_recall;
    }

    public void setPrivacy_recall(String privacy_recall) {
        this.privacy_recall = privacy_recall;
    }

    public String getRegistration_initiative() {
        return registration_initiative;
    }

    public void setRegistration_initiative(String registration_initiative) {
        this.registration_initiative = registration_initiative;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getIs_active() {
        return is_active;
    }

    public void setIs_active(String is_active) {
        this.is_active = is_active;
    }

    public String getIs_registered() {
        return is_registered;
    }

    public void setIs_registered(String is_registered) {
        this.is_registered = is_registered;
    }

    public String getIs_verified() {
        return is_verified;
    }

    public void setIs_verified(String is_verified) {
        this.is_verified = is_verified;
    }

    public String getLogin_provider() {
        return login_provider;
    }

    public void setLogin_provider(String login_provider) {
        this.login_provider = login_provider;
    }

    public String getSocial_providers() {
        return social_providers;
    }

    public void setSocial_providers(String social_providers) {
        this.social_providers = social_providers;
    }

    public String getStatus_user() {
        return status_user;
    }

    public void setStatus_user(String status_user) {
        this.status_user = status_user;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCategory_index_biscuits() {
        return category_index_biscuits;
    }

    public void setCategory_index_biscuits(String category_index_biscuits) {
        this.category_index_biscuits = category_index_biscuits;
    }

    public String getCategory_index_minicakes() {
        return category_index_minicakes;
    }

    public void setCategory_index_minicakes(String category_index_minicakes) {
        this.category_index_minicakes = category_index_minicakes;
    }

    public String getCategory_index_savoury() {
        return category_index_savoury;
    }

    public void setCategory_index_savoury(String category_index_savoury) {
        this.category_index_savoury = category_index_savoury;
    }

    public String getCategory_index_seasonal() {
        return category_index_seasonal;
    }

    public void setCategory_index_seasonal(String category_index_seasonal) {
        this.category_index_seasonal = category_index_seasonal;
    }

    public String getTaste_index_chocolover() {
        return taste_index_chocolover;
    }

    public void setTaste_index_chocolover(String taste_index_chocolover) {
        this.taste_index_chocolover = taste_index_chocolover;
    }

    public String getTaste_index_creamlover() {
        return taste_index_creamlover;
    }

    public void setTaste_index_creamlover(String taste_index_creamlover) {
        this.taste_index_creamlover = taste_index_creamlover;
    }

    public String getTaste_index_fillinglover() {
        return taste_index_fillinglover;
    }

    public void setTaste_index_fillinglover(String taste_index_fillinglover) {
        this.taste_index_fillinglover = taste_index_fillinglover;
    }

    public String getTaste_index_fruitlover() {
        return taste_index_fruitlover;
    }

    public void setTaste_index_fruitlover(String taste_index_fruitlover) {
        this.taste_index_fruitlover = taste_index_fruitlover;
    }

    public String getTaste_index_plainloverv() {
        return taste_index_plainloverv;
    }

    public void setTaste_index_plainloverv(String taste_index_plainloverv) {
        this.taste_index_plainloverv = taste_index_plainloverv;
    }

    public String getTaste_index_savourylover() {
        return taste_index_savourylover;
    }

    public void setTaste_index_savourylover(String taste_index_savourylover) {
        this.taste_index_savourylover = taste_index_savourylover;
    }

    public String getLast_update_date() {
        return last_update_date;
    }

    public void setLast_update_date(String last_update_date) {
        this.last_update_date = last_update_date;
    }

    public String getOptin_date() {
        return optin_date;
    }

    public void setOptin_date(String optin_date) {
        this.optin_date = optin_date;
    }

    public String getPrivacy_store() {
        return privacy_store;
    }

    public void setPrivacy_store(String privacy_store) {
        this.privacy_store = privacy_store;
    }

    public String getRegistation_date() {
        return registation_date;
    }

    public void setRegistation_date(String registation_date) {
        this.registation_date = registation_date;
    }

    public String getValassis_uid() {
        return valassis_uid;
    }

    public void setValassis_uid(String valassis_uid) {
        this.valassis_uid = valassis_uid;
    }


    @Override
    public String toString() {
        return "Utente{" +
                "processed=" + processed +
                ", uid='" + uid + '\'' +
                ", email='" + email + '\'' +
                ", birthdayv='" + birthdayv + '\'' +
                ", birthmonth='" + birthmonth + '\'' +
                ", birthyear='" + birthyear + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", gender='" + gender + '\'' +
                ", zip='" + zip + '\'' +
                ", codprovince='" + codprovince + '\'' +
                ", dv_desktopcount='" + dv_desktopcount + '\'' +
                ", dv_desktoplast='" + dv_desktoplast + '\'' +
                ", dv_mobilecount='" + dv_mobilecount + '\'' +
                ", dv_mobilelast='" + dv_mobilelast + '\'' +
                ", dv_tabletcount='" + dv_tabletcount + '\'' +
                ", dv_tabletlast='" + dv_tabletlast + '\'' +
                ", lastlogindate='" + lastlogindate + '\'' +
                ", mobilephone='" + mobilephone + '\'' +
                ", pr_bauli='" + pr_bauli + '\'' +
                ", pr_motta='" + pr_motta + '\'' +
                ", pr_buondi='" + pr_buondi + '\'' +
                ", pr_girella='" + pr_girella + '\'' +
                ", pr_yoyo='" + pr_yoyo + '\'' +
                ", pr_ciocori='" + pr_ciocori + '\'' +
                ", pr_doria='" + pr_doria + '\'' +
                ", pr_bistefani='" + pr_bistefani + '\'' +
                ", pr_alemagna='" + pr_alemagna + '\'' +
                ", pr_casalini='" + pr_casalini + '\'' +
                ", pr_bauligroup='" + pr_bauligroup + '\'' +
                ", preferred_retailer='" + preferred_retailer + '\'' +
                ", privacy_profiling='" + privacy_profiling + '\'' +
                ", privacy_recall='" + privacy_recall + '\'' +
                ", registration_initiative='" + registration_initiative + '\'' +
                ", telephone='" + telephone + '\'' +
                ", is_active='" + is_active + '\'' +
                ", is_registered='" + is_registered + '\'' +
                ", is_verified='" + is_verified + '\'' +
                ", login_provider='" + login_provider + '\'' +
                ", social_providers='" + social_providers + '\'' +
                ", status_user='" + status_user + '\'' +
                ", address='" + address + '\'' +
                ", category_index_biscuits='" + category_index_biscuits + '\'' +
                ", category_index_minicakes='" + category_index_minicakes + '\'' +
                ", category_index_savoury='" + category_index_savoury + '\'' +
                ", category_index_seasonal='" + category_index_seasonal + '\'' +
                ", taste_index_chocolover='" + taste_index_chocolover + '\'' +
                ", taste_index_creamlover='" + taste_index_creamlover + '\'' +
                ", taste_index_fillinglover='" + taste_index_fillinglover + '\'' +
                ", taste_index_fruitlover='" + taste_index_fruitlover + '\'' +
                ", taste_index_plainloverv='" + taste_index_plainloverv + '\'' +
                ", taste_index_savourylover='" + taste_index_savourylover + '\'' +
                ", last_update_date='" + last_update_date + '\'' +
                ", optin_date='" + optin_date + '\'' +
                ", privacy_store='" + privacy_store + '\'' +
                ", registation_date='" + registation_date + '\'' +
                ", valassis_uid='" + valassis_uid + '\'' +
                '}';
    }
}
