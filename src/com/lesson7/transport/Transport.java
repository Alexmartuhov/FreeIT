package com.lesson7.transport;

public abstract class Transport {
    int power;
    String brand;
    int maxSpeed;
    int weight;
    double kWPower(){
        return 0.74*(double)power;
    }
}
