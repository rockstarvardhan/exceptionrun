package com.neoteric.map.mapdemo.realtimeianda;

public class MovieBooking extends Booking{
    private double ticketPrice;


    public MovieBooking(String bookingId, String showTime, int numberOfSeats, double ticketPrice)
            throws InvalidSeatsException, BookingConflictException, InvalidPriceException {
        super(bookingId, showTime, numberOfSeats);
        setTicketPrice(ticketPrice);
    }

    public double getTicketPrice() {
        return ticketPrice;
    }
    // Setter for ticketPrice with validation
    public void setTicketPrice(double ticketPrice) throws InvalidPriceException {
        if (ticketPrice <= 0) {
            throw new InvalidPriceException("Ticket price must be greater than zero.");
        }
        this.ticketPrice = ticketPrice;
    }
    // Implementing the method from the BookingOperations interface
    @Override
    public double calculateTotalPrice() {
        return getNumberOfSeats() * ticketPrice;
    }
    // Overriding to include additional details
    @Override
    public void displayBookingDetails() {
        super.displayBookingDetails(); // Calling the parent method
        System.out.println("Ticket Price: $" + ticketPrice);
        System.out.println("Total Price: $" + calculateTotalPrice());
    }
}
