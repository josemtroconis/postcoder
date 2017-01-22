package com.fexco.dto;

/**
 * Created by josemanuel.troconis.
 */

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Premise extends IrishPostCode {

    private String pobox;
    private String departmentname;
    private String subbuildingname;
    private String recodes;
    private Boolean morevalues;
    private Integer nextpage;
    private Integer totalresults;
    private Boolean alias;

    public Premise() {
    }

    public String getPobox() {
        return pobox;
    }

    public void setPobox(String pobox) {
        this.pobox = pobox;
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
    }

    public String getSubbuildingname() {
        return subbuildingname;
    }

    public void setSubbuildingname(String subbuildingname) {
        this.subbuildingname = subbuildingname;
    }

    public String getRecodes() {
        return recodes;
    }

    public void setRecodes(String recodes) {
        this.recodes = recodes;
    }

    public Boolean getMorevalues() {
        return morevalues;
    }

    public void setMorevalues(Boolean morevalues) {
        this.morevalues = morevalues;
    }

    public Integer getNextpage() {
        return nextpage;
    }

    public void setNextpage(Integer nextpage) {
        this.nextpage = nextpage;
    }

    public Integer getTotalresults() {
        return totalresults;
    }

    public void setTotalresults(Integer totalresults) {
        this.totalresults = totalresults;
    }

    public Boolean getAlias() {
        return alias;
    }

    public void setAlias(Boolean alias) {
        this.alias = alias;
    }

    @Override
    public String toString() {
        return "Premise{" +
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
                ", pobox='" + pobox + '\'' +
                ", departmentname='" + departmentname + '\'' +
                ", subbuildingname='" + subbuildingname + '\'' +
                ", recodes='" + recodes + '\'' +
                ", morevalues=" + morevalues +
                ", nextpage=" + nextpage +
                ", totalresults=" + totalresults +
                ", alias=" + alias +
                '}';
    }
}