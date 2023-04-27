package org.example.spaceship;

import org.example.passenger.Human;
import org.example.passenger.Martian;
import org.example.passenger.Passenger;
import org.example.seat.HumanSeat;
import org.example.seat.MartianSeat;
import org.example.seat.Seat;

import java.util.ArrayList;
import java.util.List;

public class Spaceship {
    private List<Seat> seats;
    private final int capacity;

    public Spaceship(int capacity){
        this.capacity = capacity;
        seats = new ArrayList<>(capacity);
    }

    public void bookSeat(Passenger passenger){
        if(seats.size() < capacity){
            if(passenger instanceof Human){
                Seat newHumanSeat = new HumanSeat(passenger);
                newHumanSeat.setBooked(true);
                seats.add(newHumanSeat);
            }
            else if (passenger instanceof Martian) {
                Seat newMartianSeat = new MartianSeat(passenger);
                newMartianSeat.setBooked(true);
                seats.add(newMartianSeat);
            }
        }else{
            System.out.println("spaceship full ");
        }
    }

    public Seat getSeatType(Passenger passenger){
        for(Seat seat: seats){
            if(seat.getPassenger().getID() == passenger.getID()){
                return seat;
            }
        }
        return null;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public int getCapacity() {
        return capacity;
    }
}
