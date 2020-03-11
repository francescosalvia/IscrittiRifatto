package com.contactlab.iscritti.controller;

import com.contactlab.iscritti.service.UtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UtentiController {


    @Autowired
    UtenteService service;


/*@PostMapping("/leggi")
    public void leggiFile() {
    service.readUtenteFromCSV1();
}*/

    @PostMapping("/leggi")
    public void leggiFile() {
        service.readAll();
    }

    @PostMapping("/create")
    public void create2Table() {
        service.modifyTable();
    }

    @PostMapping("/scrivi")
    public void scrivi() {
        service.out();
    }

    @PostMapping("/test")
    public void test() {
        service.test();
    }


}
