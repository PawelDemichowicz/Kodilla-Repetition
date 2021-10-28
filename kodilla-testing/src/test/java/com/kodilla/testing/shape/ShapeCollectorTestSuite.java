package com.kodilla.testing.shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShapeCollectorTestSuite {

    @Test
    public void testAddFigure(){
        //Given
        Shape circle = new Circle(6);
        ShapeCollector theShape = new ShapeCollector();

        //When
        theShape.addFigure(circle);
        Shape retrievedFigures = theShape.getFigure(0);

        //Then
        Assertions.assertEquals(1, theShape.getFigures().size());
        Assertions.assertEquals(retrievedFigures,circle);
    }

    @Test
    public void testRemoveFigure(){
        //Given
        Shape circle = new Circle(6);
        ShapeCollector theShape = new ShapeCollector();
        theShape.addFigure(circle);

        //When
        boolean result = theShape.removeFigure(circle);

        //Then
        Assertions.assertTrue(result);
        Assertions.assertEquals(0,theShape.getFigures().size());
    }

    @Test
    public void testGetFigure(){
        //Given
        Shape circle = new Circle(6);
        ShapeCollector theShape = new ShapeCollector();
        theShape.addFigure(circle);

        //When
        Shape retrievedFigure = theShape.getFigure(0);

        //Then
        Assertions.assertEquals(retrievedFigure,circle);
    }
}
