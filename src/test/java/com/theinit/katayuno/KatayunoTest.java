package com.theinit.katayuno;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KatayunoTest {

    private static final Logger logger = LoggerFactory.getLogger(Katayuno.class);

    @BeforeClass
    public static void onceExecuted(){
        logger.debug("@BeforeClass");
    }

    @Test
    public void katayunoSumTest(){
        logger.debug("@Test --> katayunoSumTest");

        Katayuno katayuno = new Katayuno();

        int sumResult = katayuno.sum(2,2);

        Assert.assertEquals(4, sumResult);

    }

}
