package com.bnpp.galaxy.entities.finastra;

import javax.persistence.Column;
import javax.persistence.Id;

//@Entity
//@Table(name = "CARDIF_TRANSCODE_DATA", schema = "OWN_05888_FIN")
//@IdClass(CardifTranscodeDataEntityPK.class)
public class CardifTranscodeDataEntity {
    @Id
    @Column(name = "SOURCE_ID")
    private int sourceId;
    @Id
    @Column(name = "CATEGORY_ID")
    private int categoryId;
    @Id
    @Column(name = "INPUT")
    private String input;
    @Id
    @Column(name = "OUTPUT")
    private String output;

    public int getSourceId() {
        return sourceId;
    }

    public void setSourceId(int sourceId) {
        this.sourceId = sourceId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }
}
