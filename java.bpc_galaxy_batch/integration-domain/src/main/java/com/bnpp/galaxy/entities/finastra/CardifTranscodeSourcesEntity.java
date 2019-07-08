package com.bnpp.galaxy.entities.finastra;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
@Table(name = "CARDIF_TRANSCODE_SOURCES", schema = "OWN_05888_FIN")

public class CardifTranscodeSourcesEntity {
    @Id
    @Column(name = "ID")
    private int id;
    @Basic
    @Column(name = "NAME")
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
