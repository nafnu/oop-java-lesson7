package com.jetbrains;

 public class RowingBoat extends Vehicle {

        public RowingBoat () {

            MessageCentre.DebugMessage("Creating a Rowing Boat");

        }


     @Override
     public String toString() {

         return String.format("rowing boat");
     }

     @Override
     public void Move(int speed, String direction) {

         MessageCentre.DebugMessage(String.format("I am rowing %s at %d metres per hour", direction, speed));
     }

}

