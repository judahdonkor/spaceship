package org.example.passenger;

import org.example.space.Pluto;

public abstract class Passenger {
    private final String ID;
    private final String name;
    public Passenger(String id, String name){
        this.ID = id;
        this.name = name;
        }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Passenger " + name;
    }

    public abstract String plutoBelief(Pluto pluto);


}

