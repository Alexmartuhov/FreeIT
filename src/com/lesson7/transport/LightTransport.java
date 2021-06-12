package com.lesson7.transport;

public class LightTransport extends LandTransport {
    private String bodyType;
    private int numberOfPassengers;

    private void specification() {
        System.out.println("Легковой автомобиль марки " + brand + ", мощность двигателя - " +
                power + " л.с. (" + kWPower() + " кВт/ч), " + "масса - " +
                weight + ", максимальная скорость - " + maxSpeed + ", " +
                "количество полос - " + numberOfWheel + ", расход топлива - "
                + fuelConsumption + ", тип кузова - " + bodyType + ", количество пассажиров - "
                + numberOfPassengers);
    }
    private void run (double time){
        double run=maxSpeed*time;
        double fuel=run*fuelConsumption/100;
        System.out.println("За время "+time+" часа(ов) автомобиль "+brand+" двигаясь с максимальной скоростью "
                +maxSpeed+" км/ч израсходует "+fuel+" литр(ов) топлива");
    }
}
