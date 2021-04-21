package com.lesson7.transport;

public abstract class Transport {
    protected int power;
    protected String brand;
    protected int maxSpeed;
    protected int weight;

    protected double kWPower() {
        return 0.74 * (double) power;
    }
}

