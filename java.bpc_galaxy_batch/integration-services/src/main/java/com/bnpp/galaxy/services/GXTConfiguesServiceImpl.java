package com.bnpp.galaxy.services;

import com.bnpp.galaxy.dto.GXTConfiguesDTO;
import com.bnpp.galaxy.entities.GXTConfigues;
import com.bnpp.galaxy.mappers.GXTConfiguesMapper;
import com.bnpp.galaxy.repositories.GXTConfigsrep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author c59635
 */
@Service("gxtConfiguesService")
public class GXTConfiguesServiceImpl implements GXTConfiguesService {

    @Autowired
    private GXTConfigsrep gxtConfigsrep;

    @Autowired
    private GXTConfiguesMapper mappingMapStruct;

    /**
     * Recuperation de la configuration active
     */
    //@Override
    //@Transactional
    //public GXTConfiguesDTO getActifConfig() {
    //  return mappingMapStruct.toGXTConfiguesDTO(gxtConfigsrep.getActivateConfig());
    //}
    @Override
    public List<GXTConfiguesDTO> findAll() {
        List<GXTConfigues> results = (List<GXTConfigues>) gxtConfigsrep.findAll();
        return mappingMapStruct.toGXTConfiguesDTOs(results);

    }

}
