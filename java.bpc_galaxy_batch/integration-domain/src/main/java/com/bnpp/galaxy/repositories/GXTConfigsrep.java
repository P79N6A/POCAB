package com.bnpp.galaxy.repositories;

import com.bnpp.galaxy.entities.GXTConfigues;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface GXTConfigsrep extends CrudRepository<GXTConfigues, Integer> {


    //@Transactional
    //@Async
    //@Query("SELECT gc FROM GXTConfigues gc WHERE gc.actif = 1")
    //public GXTConfigues getActivateConfig();
}
