package com.contactlab.iscritti.repository;

import com.contactlab.iscritti.data.UtenteDb;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface UtentiPageRepository  extends PagingAndSortingRepository<UtenteDb, Integer>  {

    List<UtenteDb> findAllByProcessed(int processed, Pageable pageable);
}
