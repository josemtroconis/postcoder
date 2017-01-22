package com.fexco.dto;

/**
 * Created by jose.
 */
public class IrishPostCode {

    private String addressline1;
    private String addressline2;
    private String addressline3;
    private String summaryline;
    private String organisation;
    private String buildingname;
    private String number;
    private String premise;
    private String dependentstreet;
    private String street;
    private String doubledependentlocality;
    private String dependentlocality;
    private String posttown;
    private String county;
    private String postcode;

    public IrishPostCode() {
    }

    public String getAddressline1() {
        return addressline1;
    }

    public void setAddressline1(String addressline1) {
        this.addressline1 = addressline1;
    }

    public String getAddressline2() {
        return addressline2;
    }

    public void setAddressline2(String addressline2) {
        this.addressline2 = addressline2;
    }

    public String getAddressline3() {
        return addressline3;
    }

    public void setAddressline3(String addressline3) {
        this.addressline3 = addressline3;
    }

    public String getSummaryline() {
        return summaryline;
    }

    public void setSummaryline(String summaryline) {
        this.summaryline = summaryline;
    }

    public String getOrganisation() {
        return organisation;
    }

    public void setOrganisation(String organisation) {
        this.organisation = organisation;
    }

    public String getBuildingname() {
        return buildingname;
    }

    public void setBuildingname(String buildingname) {
        this.buildingname = buildingname;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPremise() {
        return premise;
    }

    public void setPremise(String premise) {
        this.premise = premise;
    }

    public String getDependentstreet() {
        return dependentstreet;
    }

    public void setDependentstreet(String dependentstreet) {
        this.dependentstreet = dependentstreet;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getDoubledependentlocality() {
        return doubledependentlocality;
    }

    public void setDoubledependentlocality(String doubledependentlocality) {
        this.doubledependentlocality = doubledependentlocality;
    }

    public String getDependentlocality() {
        return dependentlocality;
    }

    public void setDependentlocality(String dependentlocality) {
        this.dependentlocality = dependentlocality;
    }

    public String getPosttown() {
        return posttown;
    }

    public void setPosttown(String posttown) {
        this.posttown = posttown;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    @Override
    public String toString() {
        return "IrishPostCode{" +
                "addressline1='" + addressline1 + '\'' +
                ", addressline2='" + addressline2 + '\'' +
                ", addressline3='" + addressline3 + '\'' +
                ", summaryline='" + summaryline + '\'' +
                ", organisation='" + organisation + '\'' +
                ", buildingname='" + buildingname + '\'' +
                ", number='" + number + '\'' +
                ", premise='" + premise + '\'' +
                ", dependentstreet='" + dependentstreet + '\'' +
                ", street='" + street + '\'' +
                ", doubledependentlocality='" + doubledependentlocality + '\'' +
                ", dependentlocality='" + dependentlocality + '\'' +
                ", posttown='" + posttown + '\'' +
                ", county='" + county + '\'' +
                ", postcode='" + postcode + '\'' +
                '}';
    }
}
