package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User john = new Millenials("John Wick");
        User frodo = new YGeneration("Frodo Baggins");
        User james = new ZGeneration("James Bond");

        //When
        String johnSocial = john.sharePost();
        System.out.println("John share: " + johnSocial);
        String frodoSocial = frodo.sharePost();
        System.out.println("Frodo share: " + frodoSocial);
        String jamesSocial = james.sharePost();
        System.out.println("James share: " + jamesSocial);

        //Then
        Assertions.assertEquals("Facebook", johnSocial);
        Assertions.assertEquals("Snapchat", frodoSocial);
        Assertions.assertEquals("Twitter", jamesSocial);
    }

    @Test
    public void testIndividualSharingStrategies() {
        //Given
        User john = new Millenials("John Wick");

        //When
        String johnSocial = john.sharePost();
        System.out.println("John social: " + johnSocial);
        john.setSocialPublisher(new TwitterPublisher());
        johnSocial = john.sharePost();
        System.out.println("John now share: " + johnSocial);

        //Then
        Assertions.assertEquals("Twitter", johnSocial);

    }
}
