package com.fexco.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by jose.
 */
@Aspect
@Component
public class FormatJsonAspect {

    private static final Logger logger = LoggerFactory.getLogger(FormatJsonAspect.class);

    @Around("execution(* com.fexco.service.ApiService.* (java.lang.String)) && args(wsUrlCall)")
    public Object aroundAdvice(ProceedingJoinPoint pjp, String wsUrlCall){
        Object returnVal = null;

        // Set-Override format to json
        wsUrlCall = overrideParams(wsUrlCall);

        try {
            returnVal = pjp.proceed(new Object[] { wsUrlCall });
        } catch (Throwable e) {
            logger.error("Error setting Json format parameter to: " + wsUrlCall);
        }

        return returnVal;
    }

    /**
     * Add or override format parameter with the value of json
     * @param wsUrlCall
     * @return
     */
    private String overrideParams(String wsUrlCall){
        final String defaultFormatParam = "format=json";
        if (wsUrlCall == null){
            wsUrlCall = new String(defaultFormatParam);
        } else if (!wsUrlCall.contains("format=")){
            wsUrlCall += "&" + defaultFormatParam;
        } else {
            wsUrlCall = wsUrlCall.replace("format=xml", "format=json");
        }

        return wsUrlCall;
    }
}
