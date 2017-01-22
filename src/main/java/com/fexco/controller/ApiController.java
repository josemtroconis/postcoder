package com.fexco.controller;

import com.fexco.config.ApiConstant;
import com.fexco.dto.EirCode;
import com.fexco.dto.Premise;
import com.fexco.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by josemanuel.troconis.
 */
@RestController
public class ApiController {

    @Autowired
    private ApiService apiService;

    @RequestMapping(value = "/")
    public String home(){
        return "Working";
    }

    @RequestMapping(value = "/pcw/{apiKey}/{operation:address|addressgeo|position|rgeo}/ie/{fragment}", method = RequestMethod.GET)
    public EirCode[] getEirCode(HttpServletRequest request){
        String finalWSUrl = parseRequestUrl(request);

        EirCode[] response = apiService.retrieveEirCode(finalWSUrl);
        return response;
    }

    @RequestMapping(value = "/pcw/{apiKey}/rgeo/ie/{latitude}/{longitude}", method = RequestMethod.GET)
    public EirCode[] getEirCodeRGeo(HttpServletRequest request){
        String finalWSUrl = parseRequestUrl(request);

        EirCode[] response = apiService.retrieveEirCode(finalWSUrl);
        return response;
    }

    @RequestMapping(value = "/pcw/{apiKey}/address/uk/{fragment}", method = RequestMethod.GET)
    public Premise[] getPremise(HttpServletRequest request){
        String finalWSUrl = parseRequestUrl(request);

        Premise[] response = apiService.retrievePremise(finalWSUrl);
        return response;
    }

    private String parseRequestUrl(final HttpServletRequest request){
        String wsUrlCall = ApiConstant.POSTCODER_URL + request.getRequestURI();
        String queryString = request.getQueryString();
        String finalWSUrl = (queryString != null) ? (wsUrlCall + "?" + queryString) : wsUrlCall;
        return finalWSUrl;
    }

}
