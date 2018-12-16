package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    private static Logger logger;

    @Test
    public void testGetLastLog() {
        //Given
        logger.getInstance().log("This is log");
        //When
        String lastLog = logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("This is log", lastLog);
    }
}
