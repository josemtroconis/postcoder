package com.fexco.dao;

import com.fexco.dto.EirCode;
import com.fexco.dto.Premise;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.web.client.RestTemplate;

/**
 * Created by jose.
 */
@Profile("production")
@Configuration
public class WSDao implements IWSDao {

    private static final Logger logger = LoggerFactory.getLogger(WSDao.class);

    public WSDao() {
        logger.info("Instantiated Dao For WS: " + WSDao.class.getSimpleName());
    }

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public EirCode[] retrieveEirCodeFromWS(String wsUrlCall) {
        EirCode[] eirCodes = restTemplate.getForObject(wsUrlCall, EirCode[].class);
        return eirCodes;
    }

    @Override
    public Premise[] retrievePremiseFromWS(String wsUrlCall) {
        Premise[] premises = restTemplate.getForObject(wsUrlCall, Premise[].class);
        return premises;
    }

}
