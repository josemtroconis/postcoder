package com.fexco.dto;

/**
 * Created by josemanuel.troconis.
 */

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EirCode extends IrishPostCode {

    private String latitude;
    private String longitude;
    private String what3words;

    public EirCode() {
        super();
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getWhat3words() {
        return what3words;
    }

    public void setWhat3words(String what3words) {
        this.what3words = what3words;
    }

    @Override
    public String toString() {
        return "EirCode{" +
                "addressline1='" + getAddressline1() + '\'' +
                ", addressline2='" + getAddressline2() + '\'' +
                ", addressline3='" + getAddressline3() + '\'' +
                ", summaryline='" + getSummaryline() + '\'' +
                ", organisation='" + getOrganisation() + '\'' +
                ", buildingname='" + getBuildingname() + '\'' +
                ", number='" + getNumber() + '\'' +
                ", premise='" + getPremise() + '\'' +
                ", dependentstreet='" + getDependentstreet() + '\'' +
                ", street='" + getStreet() + '\'' +
                ", doubledependentlocality='" + getDoubledependentlocality() + '\'' +
                ", dependentlocality='" + getDependentlocality() + '\'' +
                ", posttown='" + getPosttown() + '\'' +
                ", county='" + getCounty() + '\'' +
                ", postcode='" + getPostcode() + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", what3words='" + what3words + '\'' +
                '}';
    }
}