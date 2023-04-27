package org.example.seat;

import org.example.passenger.Passenger;

public class MartianSeat extends Seat{

    public MartianSeat(Passenger passenger) {
        super(passenger);
    }

    @Override
    protected void serveMeal() {
        System.out.println("serve martian meal");
    }

    @Override
    public String toString() {
        return "MartianSeat{}";
    }
}
