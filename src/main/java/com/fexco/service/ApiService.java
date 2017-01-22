package com.fexco.service;

import com.fexco.dao.IWSDao;
import com.fexco.dto.EirCode;
import com.fexco.dto.Premise;
import com.fexco.model.EirCodeModel;
import com.fexco.model.PremiseModel;
import com.fexco.repository.EirCodeRepository;
import com.fexco.repository.PremiseRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Created by josemanuel.troconis.
 */
@Service
public class ApiService {

    private static final Logger logger = LoggerFactory.getLogger(ApiService.class);

    @Autowired
    private EirCodeRepository eirCodeRepository;

    @Autowired
    private PremiseRepository premiseRepository;

    @Autowired
    private IWSDao wsDao;

    @Cacheable("eirCode")
    public EirCode[] retrieveEirCode(String wsUrlCall){
        logger.info("---- Execute EirCode request to WS");
        EirCode[] response = wsDao.retrieveEirCodeFromWS(wsUrlCall);
        EirCodeModel model = new EirCodeModel(wsUrlCall, response);

        // Save in DB
        eirCodeRepository.insert(model);
        logger.info("---- Saved EirCode in DB");

        return response;
    }

    @Cacheable("premise")
    public Premise[] retrievePremise(String wsUrlCall){
        logger.info("---- Execute Premise request to WS");
        Premise[] response = wsDao.retrievePremiseFromWS(wsUrlCall);
        PremiseModel model = new PremiseModel(wsUrlCall, response);

        // Save in DB
        premiseRepository.insert(model);
        logger.info("---- Saved Premise in DB");

        return response;
    }
}
