package com.jetbrains;

public class Plane extends Vehicle {

        public Plane () {

            MessageCentre.DebugMessage("Creating a Plane");
        }

    @Override
    public String toString() {

        return String.format("plane");
    }

    @Override
    public void Move(int speed, String direction) {

        MessageCentre.DebugMessage(String.format("I am flying %s at %d knots per hour", direction, speed));
    }

 }


