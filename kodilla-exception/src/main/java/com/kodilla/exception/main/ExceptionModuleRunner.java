package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;
import com.kodilla.exception.io.FileReaderWithoutHandling;
import com.kodilla.exception.test.Flight;
import com.kodilla.exception.test.FlightSearchEngine;
import com.kodilla.exception.test.RouteNotFoundException;

public class ExceptionModuleRunner {

    public static void main(String[] args) {

        FlightSearchEngine flightSearchEngine = new FlightSearchEngine();

        try {
            flightSearchEngine.findFlight(new Flight("Reykjavik", "Frankfurt"));
        } catch (RouteNotFoundException e){
            System.out.println(e.getMessage());
        }

    }
}
