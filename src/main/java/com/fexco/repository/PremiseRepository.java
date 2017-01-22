package com.fexco.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.fexco.model.PremiseModel;

/**
 * Created by josemanuel.troconis.
 */
public interface PremiseRepository extends MongoRepository<PremiseModel, String> {

}