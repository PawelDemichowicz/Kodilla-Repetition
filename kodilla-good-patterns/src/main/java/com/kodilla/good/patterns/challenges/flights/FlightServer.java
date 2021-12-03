package com.kodilla.good.patterns.challenges.flights;

import java.util.Scanner;

public class FlightServer {
    public static void main(String[] args) {
        FlightSearch flightSearch = new FlightSearch(new FlightsData());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please chose the type of searching");
        String type = scanner.nextLine();

        System.out.println("Please write the city");
        String destination = scanner.nextLine();

        flightSearch.typeOfSearch(type,destination);
    }
}
