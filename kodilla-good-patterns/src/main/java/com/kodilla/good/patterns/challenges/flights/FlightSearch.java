package com.kodilla.good.patterns.challenges.flights;

import java.util.Set;
import java.util.stream.Collectors;

public class FlightSearch {

    private static final String DEPARTURE = "Departure";
    private static final String ARRIVAL = "Arrival";
    private static final String TRANSFER = "Transfer";
    private FlightsData flightsData;

    public FlightSearch(final FlightsData flightsData) {
        this.flightsData = flightsData;
    }

    public void typeOfSearch(String type, String destination) {
        if (DEPARTURE.equals(type)) {
            System.out.println(searchingDepartures(destination));
        } else if (ARRIVAL.equals(type)) {
            System.out.println(searchingArrival(destination));
        } else if (TRANSFER.equals(type)) {
            System.out.println(searchingTransfer(destination));
        } else {
            System.out.println("This flight is not available anymore!");
        }
    }

    public Set<Flight> searchingDepartures(String destination) {
        return flightsData.getFlights().stream()
                .filter(f -> f.getDeparture().equals(destination))
                .collect(Collectors.toSet());
    }

    public Set<Flight> searchingArrival(String destination) {
        return flightsData.getFlights().stream()
                .filter(f -> f.getArrival().equals(destination))
                .collect(Collectors.toSet());
    }

    public Set<Flight> searchingTransfer(String destination) {
        return flightsData.getFlights().stream()
                .filter(f -> f.getTransfer().equals(destination))
                .collect(Collectors.toSet());
    }
}
