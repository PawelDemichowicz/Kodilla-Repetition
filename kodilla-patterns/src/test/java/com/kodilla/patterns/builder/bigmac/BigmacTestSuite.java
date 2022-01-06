package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("sesame")
                .burgers(2)
                .sauce("mayo")
                .ingredients("tomato")
                .ingredients("cheese")
                .ingredients("bacon")
                .build();

        System.out.println(bigmac);

        //When
        int howMayIngredients = bigmac.getIngredients().size();
        String sauce = bigmac.getSauce();

        //Then
        Assertions.assertEquals(3, howMayIngredients);
        Assertions.assertEquals("mayo", sauce);
        Assertions.assertTrue(bigmac.getIngredients().contains("tomato"));

    }
}
