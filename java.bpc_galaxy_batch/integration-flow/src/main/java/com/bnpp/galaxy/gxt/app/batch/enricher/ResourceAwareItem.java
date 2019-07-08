package com.bnpp.galaxy.gxt.app.batch.enricher;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResourceAwareItem<T> {

    private T item;

    /** URI **/
    private String resource;

}
