package com.fexco.model;

import org.springframework.data.annotation.Id;

import com.fexco.dto.EirCode;

/**
 * Created by josemanuel.troconis.
 */
public class EirCodeModel {

    @Id
    private String id;

    private String request;
    private EirCode[] eircodes;

    public EirCodeModel() {}

    public EirCodeModel(String request, EirCode[] eircodes) {
        this.request = request;
        this.eircodes = eircodes;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public EirCode[] getEircodes() {
        return eircodes;
    }

    public void setEircodes(EirCode[] eircodes) {
        this.eircodes = eircodes;
    }
}
