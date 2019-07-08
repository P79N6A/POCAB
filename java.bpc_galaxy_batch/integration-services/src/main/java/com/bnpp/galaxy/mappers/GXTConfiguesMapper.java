package com.bnpp.galaxy.mappers;

import com.bnpp.galaxy.dto.GXTConfiguesDTO;
import com.bnpp.galaxy.entities.GXTConfigues;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")

public interface GXTConfiguesMapper {

    GXTConfiguesDTO toGXTConfiguesDTO(GXTConfigues gxtConfigues);

    List<GXTConfiguesDTO> toGXTConfiguesDTOs(List<GXTConfigues> gxtConfiguesList);

    GXTConfigues toGXTConfigues(GXTConfiguesDTO gxtConfiguesDTO);
}
