package org.example;

import org.example.passenger.Human;
import org.example.passenger.Martian;
import org.example.passenger.Passenger;
import org.example.space.Pluto;
import org.example.spaceship.Spaceship;

public class Main {
    public static void main(String[] args){
        Passenger human = new Human("123", "Emma");
        Passenger martian = new Martian("1243", "Ekow");
        Spaceship zura = new Spaceship(1);

        zura.bookSeat(martian);

        System.out.println("the seat booked for " + martian + " is "+ zura.getSeatType(martian));
        zura.bookSeat(human);
        System.out.println("the seat booked for " + human + " is "+ zura.getSeatType(human));
        Pluto pluto = new Pluto();

        System.out.println(human.plutoBelief(pluto));


    }


}