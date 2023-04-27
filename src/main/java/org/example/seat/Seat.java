package org.example.seat;

import org.example.passenger.Passenger;

public abstract class Seat {
    private boolean booked;
    private Passenger passenger;

    protected Seat(Passenger passenger){
        this.passenger = passenger;
    }

    protected abstract void serveMeal();
    public boolean isBooked() {
        return booked;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }

    public Passenger getPassenger() {
        return passenger;
    }
}
