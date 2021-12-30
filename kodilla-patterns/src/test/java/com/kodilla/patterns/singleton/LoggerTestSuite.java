package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoggerTestSuite {

    @Test
    public void testLastLog() {
        //Given
        Logger.getInstance().log("Application broken");

        //When
        String result = Logger.getInstance().getLastLog();

        //Then
        Assertions.assertEquals("Application broken", result);
    }
}
