package com.contactlab.iscritti.properties;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "uconfig")
public class UtenteProperties {


    private String urlFile;
    private String urlWrite;
    private String url;
    private String urlout;

    public String getUrlout() {
        return urlout;
    }

    public void setUrlout(String urlout) {
        this.urlout = urlout;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrlWrite() {
        return urlWrite;
    }

    public void setUrlWrite(String urlWrite) {
        this.urlWrite = urlWrite;
    }

    public String getUrlFile() {
        return urlFile;
    }

    public void setUrlFile(String urlFile) {
        this.urlFile = urlFile;
    }
}
