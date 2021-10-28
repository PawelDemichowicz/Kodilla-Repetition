package com.kodilla.testing.collection;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CollectionTestSuite{

    @BeforeEach
    public void before(){
        System.out.println("Test begin");
    }

    @AfterEach
    public void after(){
        System.out.println("Test end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        ArrayList<Integer> numbers = new ArrayList<>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        ArrayList<Integer> resultList = oddNumbersExterminator.exterminate();
        //Then
        assertEquals(numbers,resultList);
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (Integer n=2; n<10; n+=2){
            numbers.add(n);
        }
        //When
        oddNumbersExterminator.prepareList();
        ArrayList<Integer> resultList = oddNumbersExterminator.exterminate();
        //Then
        assertEquals(numbers,resultList);
    }
}
