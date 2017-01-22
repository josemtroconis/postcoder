package com.fexco.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.fexco.model.EirCodeModel;

/**
 * Created by josemanuel.troconis.
 */
public interface EirCodeRepository extends MongoRepository<EirCodeModel, String> {

}