package com.fexco.dao;

import com.fexco.dto.EirCode;
import com.fexco.dto.Premise;

/**
 * Created by jose.
 */
public interface IWSDao {

    EirCode[] retrieveEirCodeFromWS(String wsUrlCall);

    Premise[] retrievePremiseFromWS(String wsUrlCall);

}
