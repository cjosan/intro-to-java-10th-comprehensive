package com.company;

/**
 * Created by admin on 16.06.2017.
 */
public class Fan {
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 1;
    private int speed;
    private boolean on;
    private double radius;
    private String colour;

    public Fan() {
        this.speed = this.SLOW;
        this.on = false;
        this.radius = 5;
        this.colour = "blue";
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String toString() {
        if (on)
            return "The fan speed: " + speed + "\nThe radius: " +
                    radius + "\nThe colour: " + colour;
        else
            return "The fan is off" + "\nThe radius: " + radius + "\nThe colour: " + colour;
    }
}
