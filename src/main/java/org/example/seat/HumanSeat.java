package org.example.seat;

import org.example.passenger.Passenger;

public class HumanSeat extends Seat{

    public HumanSeat(Passenger passenger) {
        super(passenger);
    }

    @Override
    protected void serveMeal() {
        System.out.println("serve human meal");
    }

    @Override
    public String toString() {
        return "HumanSeat";
    }
}
