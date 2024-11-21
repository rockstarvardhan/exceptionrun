package com.neoteric.map.mapdemo.realtimeianda;

public class BookingTest {
    public static void main(String[] args) {
        try {
            MovieBooking movieBooking = new MovieBooking("MB123", "7:30 PM", 3, 12.5);
            movieBooking.displayBookingDetails();
            movieBooking.setNumberOfSeats(5);
            System.out.println("\nUpdated Booking Details:");
            movieBooking.displayBookingDetails();
            MovieBooking invalidBooking = new MovieBooking("MB124", "7:30 PM", 0, -5);
        } catch (InvalidSeatsException | InvalidPriceException | BookingConflictException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
