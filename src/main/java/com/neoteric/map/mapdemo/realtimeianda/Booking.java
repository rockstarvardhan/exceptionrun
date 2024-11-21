package com.neoteric.map.mapdemo.realtimeianda;

public abstract class Booking implements BookingOperations {
    private String bookingId;
    private String showTime;
    private int numberOfSeats;

    public Booking(String bookingId, String showTime, int numberOfSeats) throws InvalidSeatsException, BookingConflictException {
        this.bookingId = bookingId;
        setShowTime(showTime);
        setNumberOfSeats(numberOfSeats);
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getShowTime() {
        return showTime;
    }

    public void setShowTime(String showTime) throws BookingConflictException {
        if (showTime == null || showTime.isEmpty()) {
            throw new BookingConflictException("Invalid show time.");
        }
        this.showTime = showTime;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) throws InvalidSeatsException {
        if (numberOfSeats <= 0) {
            throw new InvalidSeatsException("Number of seats must be greater than zero.");
        }
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public abstract double calculateTotalPrice();

    @Override
    public void displayBookingDetails() {
        System.out.println("Booking ID: " + bookingId);
        System.out.println("Show Time: " + showTime);
        System.out.println("Number of Seats: " + numberOfSeats);
    }
}
