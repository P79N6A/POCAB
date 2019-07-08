package com.bnpp.galaxy.entities.finastra;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class CardifTranscodeDataEntityPK implements Serializable {

    @Id
    @Column(name = "SOURCE_ID")
    private int    sourceId;
    @Id
    @Column(name = "CATEGORY_ID")
    private int    categoryId;
    @Id
    @Column(name = "INPUT")
    private String input;
    @Id
    @Column(name = "OUTPUT")
    private String output;

}
