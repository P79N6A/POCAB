package com.bnpp.galaxy.entities.finastra;

import lombok.Data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
@Table(name = "CARDIF_TRANSCODE_CATEGORIES", schema = "OWN_05888_FIN")
@Data
public class CardifTranscodeCategoriesEntity {
    @Id
    @Column(name = "ID")
    private int id;
    @Basic
    @Column(name = "NAME")
    private String name;
}
