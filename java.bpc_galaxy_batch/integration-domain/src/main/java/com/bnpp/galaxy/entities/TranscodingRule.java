package com.bnpp.galaxy.entities;

import javax.persistence.*;

/**
 * Contains the information about how to transcode one field in another
 */
@Entity
@Table(name = "CARDIF_TRANSCODE_RULES")
public class TranscodingRule {

    // TODO: hypothetical class, change the attributes when the exact ones are known

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column
    private String source;

    @Column
    private String target;

    public TranscodingRule() {

    }

    public TranscodingRule(String source, String target) {
        this.source = source;
        this.target = target;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }
}
