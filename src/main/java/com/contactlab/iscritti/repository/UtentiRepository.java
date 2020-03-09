package com.contactlab.iscritti.repository;

import com.contactlab.iscritti.data.UtenteDb;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;


@Repository
public interface UtentiRepository extends PagingAndSortingRepository<UtenteDb, Integer> {

    //List<UtenteDb> findAllByProcessed(int processed, Pageable pageable);

   // List<UtenteDb> findTop100ByProcessed(int processed);

}

