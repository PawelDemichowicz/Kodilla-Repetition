package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        World world = new World();
        Continent continent1 = new Continent("Europe");
        Continent continent2 = new Continent("Asia");
        Continent continent3 = new Continent("Africa");
        Country country1 = new Country("Poland",new BigDecimal("1566168468414685446"));
        Country country2 = new Country("German",new BigDecimal("1468468765255962613"));
        Country country3 = new Country("China",new BigDecimal("1656195756462644545"));
        Country country4 = new Country("Japan",new BigDecimal("1848756495649432"));
        Country country5 = new Country("Egypt",new BigDecimal("2121849954653259162"));
        Country country6 = new Country("South Africa",new BigDecimal("6446165131315646463"));

        //When
        continent1.addCountry(country1);
        continent1.addCountry(country2);
        continent2.addCountry(country3);
        continent2.addCountry(country4);
        continent3.addCountry(country5);
        continent3.addCountry(country6);
        world.addContinent(continent1);
        world.addContinent(continent2);
        world.addContinent(continent3);
        BigDecimal totalPeople = world.getPeopleQuantity();

        //Then
        BigDecimal expectedPeople = new BigDecimal("13260696832597847661");
        Assertions.assertEquals(expectedPeople,totalPeople);
    }
}
