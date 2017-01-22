package com.fexco.model;

import org.springframework.data.annotation.Id;

import com.fexco.dto.Premise;

/**
 * Created by josemanuel.troconis.
 */
public class PremiseModel {

    @Id
    private String id;

    private String    request;
    private Premise[] premises;

    public PremiseModel() {}

    public PremiseModel(String request, Premise[] premises) {
        this.request = request;
        this.premises = premises;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public Premise[] getPremises() {
        return premises;
    }

    public void setPremises(Premise[] premises) {
        this.premises = premises;
    }
}
