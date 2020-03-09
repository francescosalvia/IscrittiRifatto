package com.contactlab.iscritti.repository;

import com.contactlab.iscritti.data.UtenteDb;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;


@Repository
public interface UtentiRepository extends CrudRepository<UtenteDb, Integer> {

    List<UtenteDb> findAllByProcessed(int processed);

    List<UtenteDb> findTop100ByProcessed(int processed);

}

