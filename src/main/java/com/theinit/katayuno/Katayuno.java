package com.theinit.katayuno;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Katayuno {

    private final Logger logger = LoggerFactory.getLogger(Katayuno.class);

    public int sum(int a, int b){
        logger.debug("======== Testing logback ===========");
        return a + b;
    }

}
