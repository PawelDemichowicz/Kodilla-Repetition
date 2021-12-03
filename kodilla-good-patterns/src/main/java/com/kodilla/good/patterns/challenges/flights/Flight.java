package com.kodilla.good.patterns.challenges.flights;

public class Flight {
    private String departure;
    private String arrival;
    private String transfer;

    public Flight(String departure, String transfer, String arrival) {
        this.departure = departure;
        this.transfer = transfer;
        this.arrival = arrival;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    public String getTransfer() {
        return transfer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;

        Flight flight = (Flight) o;

        if (departure != null ? !departure.equals(flight.departure) : flight.departure != null) return false;
        if (arrival != null ? !arrival.equals(flight.arrival) : flight.arrival != null) return false;
        return transfer != null ? transfer.equals(flight.transfer) : flight.transfer == null;
    }

    @Override
    public int hashCode() {
        int result = departure != null ? departure.hashCode() : 0;
        result = 31 * result + (arrival != null ? arrival.hashCode() : 0);
        result = 31 * result + (transfer != null ? transfer.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "departure='" + departure + '\'' +
                ", arrival='" + arrival + '\'' +
                ", transfer='" + transfer + '\'' +
                '}';
    }
}
