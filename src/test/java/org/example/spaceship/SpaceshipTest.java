package org.example.spaceship;

import org.example.passenger.Human;
import org.example.passenger.Martian;
import org.example.passenger.Passenger;
import org.example.space.Pluto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class SpaceshipTest {
    @Test
    void Given_SpaceShipWithCapacity1_When_BookSeatForOnePassenger_Then_OK() {
        Spaceship zura = new Spaceship(1);

        Passenger human = new Human("123", "Emma");

        zura.bookSeat(human);
        assertEquals(human, zura
                .getSeatType(human)
                .getPassenger());
    }

    @Test
    void Given_SpaceShipWithCapacity1_When_BookSeatForTwoPassengers_Then_SecondPassengerDoesNotGetASeat() {
        Spaceship zura = new Spaceship(1);

        // First Passenger
        Passenger human = new Human("123", "Emma");
        zura.bookSeat(human);
        assertEquals(human, zura
                .getSeatType(human)
                .getPassenger());

        // Second Passenger
        Passenger martian = new Martian("1243", "Ekow");
        zura.bookSeat(martian);
        assertNull(zura
                .getSeatType(martian));
    }

    @Test
    void Given_Pluto_When_AskHuman_Then_BelievesIsAMoon() {
        Pluto pluto = new Pluto();
        Passenger human = new Human("123", "Emma");

        assertEquals(human.plutoBelief(pluto), pluto + " is a moon");
    }

    @Test
    void Given_Pluto_When_AskMartian_Then_BelievesIsAPlanet() {
        Pluto pluto = new Pluto();
        Passenger martian = new Martian("1243", "Ekow");

        assertEquals(martian.plutoBelief(pluto), pluto + " is a planet");
    }

}
