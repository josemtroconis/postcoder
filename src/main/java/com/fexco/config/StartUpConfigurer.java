package com.fexco.config;

import com.fexco.model.EirCodeModel;
import com.fexco.model.PremiseModel;
import com.fexco.repository.EirCodeRepository;
import com.fexco.repository.PremiseRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.cache.CacheManager;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Created by josemanuel.troconis.
 */
@Component
public class StartUpConfigurer implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(StartUpConfigurer.class);

    @Autowired
    private EirCodeRepository eirCodeRepository;

    @Autowired
    private PremiseRepository premiseRepository;

    @Autowired
    private CacheManager cacheManager;

    @Autowired
    private Environment environment;

    @Override
    public void run(String... strings) throws Exception {
        logger.info("--- StartUp on Profiles: " + Arrays.toString(environment.getActiveProfiles()));

        logger.info("Load EirCode registries");
        List<EirCodeModel> eirCodeModelList = eirCodeRepository.findAll();
        for (EirCodeModel model : eirCodeModelList){
            cacheManager.getCache("eirCode").put(model.getRequest(), model.getEircodes());
        }

        logger.info("Cached " + eirCodeModelList.size() + " EirCode registries");

        logger.info("Load Premise registries");
        List<PremiseModel> premiseModelList = premiseRepository.findAll();
        for (PremiseModel model : premiseModelList ){
            cacheManager.getCache("premise").put(model.getRequest(), model.getPremises());
        }

        logger.info("Cached " + premiseModelList.size() + " Premise registries");
    }
}
