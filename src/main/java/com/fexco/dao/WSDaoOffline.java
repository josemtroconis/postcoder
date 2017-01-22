package com.fexco.dao;

import com.fexco.dto.EirCode;
import com.fexco.dto.Premise;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jose.
 */
@Profile("dev")
@Configuration
public class WSDaoOffline implements IWSDao {

    private static final Logger logger = LoggerFactory.getLogger(WSDaoOffline.class);

    public WSDaoOffline() {
        logger.info("Instantiated Dao For WS: " + WSDaoOffline.class.getSimpleName());
    }

    @Override
    public EirCode[] retrieveEirCodeFromWS(String wsUrlCall) {
        EirCode eirCode = new EirCode();
        if (wsUrlCall.contains("address/ie") || wsUrlCall.contains("addressgeo/ie")) {
            if (wsUrlCall.contains("lines=")) {
                eirCode.setAddressline1("Dept of Communications, Climate Change and Natural Resources");
                eirCode.setAddressline2("29-31 Adelaide Road");
            }
        }

        if (wsUrlCall.contains("address/ie") || wsUrlCall.contains("addressgeo/ie") || wsUrlCall.contains("rgeo/ie")) {
            eirCode.setOrganisation("Dept of Communications, Climate Change and Natural Resources");
            eirCode.setStreet("Adelaide Road");
            eirCode.setPosttown("Dublin 2");
            eirCode.setCounty("Dublin");
            eirCode.setPostcode("D02 X285");
            eirCode.setSummaryline("Dept of Communications, Climate Change and Natural Resources, 29-31 Adelaide Road, Dublin 2, D02 X285");
            eirCode.setNumber("29-31");
            eirCode.setPremise("29-31");

            if (wsUrlCall.contains("rgeo/ie")){
                eirCode.setBuildingname("Marsh House");
            }
        }

        if (wsUrlCall.contains("addressgeo/ie") || wsUrlCall.contains("position/ie")){
            eirCode.setLatitude("53.332067");
            eirCode.setLongitude("-6.255492");
        }

        if (wsUrlCall.contains("addtags=")) {
            eirCode.setWhat3words("lease.wiped.life");
        }
        return new EirCode[]{eirCode};
    }

    @Override
    public Premise[] retrievePremiseFromWS(String wsUrlCall) {
        Premise premise = new Premise();
        if (wsUrlCall.contains("lines=")) {
            premise.setAddressline1("Allies Computing Ltd");
            premise.setAddressline2("Manor Farm Barns, Fox Road");
            premise.setAddressline3("Framingham Pigot");
        }
        premise.setSummaryline("Allies Computing Ltd, Manor Farm Barns, Fox Road, Framingham Pigot, Norwich, Norfolk, NR14 7PZ");
        premise.setOrganisation("Allies Computing Ltd");
        premise.setBuildingname("Manor Farm Barns");
        premise.setPremise("Manor Farm Barns");
        premise.setStreet("Fox Road");
        premise.setDependentlocality("Framingham Pigot");
        premise.setPosttown("Norwich");
        premise.setCounty("Norfolk");
        premise.setPostcode("NR14 7PZ");
        return new Premise[]{premise};
    }

}
