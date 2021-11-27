package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearchEngine {
    
    public boolean findFlight(Flight flight) throws RouteNotFoundException{
        Map<String, Boolean> flights = new HashMap<>();
        
        flights.put("Warszawa", true);
        flights.put("Gdańsk", false);
        flights.put("Wrocław", true);
        flights.put("Katowice", false);

        if(flights.containsKey(flight.getArrivalAirport())){
            if (flights.get(flight.getArrivalAirport())){
                System.out.println("You can flight to " + flight.getArrivalAirport() + ":)");
            }else{
                System.out.println("You can not flight to " + flight.getArrivalAirport() + "!!!");
            }
            return flights.get(flight.getArrivalAirport());
        }else {
            throw new RouteNotFoundException("There is no such airport on the list :(");
        }
    }
}
