package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        double a = 6;
        double b = 3;
        //When
        double sum = calculator.add(a,b);
        double difference = calculator.sub(a,b);
        double product = calculator.mul(a,b);
        double quotient = calculator.div(a,b);
        //Then
        Assertions.assertEquals(sum, 9);
        Assertions.assertEquals(difference, 3);
        Assertions.assertEquals(product, 18);
        Assertions.assertEquals(quotient, 2);
    }
}
