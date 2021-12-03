package com.kodilla.good.patterns.challenges.flights;

import java.util.HashSet;
import java.util.Set;

public class FlightsData {

        private Set<Flight> flights;

        public FlightsData() {
                this.flights = new HashSet<>();
                flights.add(new Flight("Wrocław", "Reykjavik", "Paris"));
                flights.add(new Flight("Wrocław", "London", "New York"));
                flights.add(new Flight("Warszawa", "Frankfurt", "Madryt"));
        }

        public Set<Flight> getFlights() {
                return flights;
        }
}
