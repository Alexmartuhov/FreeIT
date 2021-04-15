package com.lesson7.transport;

public class CivilAirTransport extends AirTransport {
    int numberOfPassengers;
    boolean havingBusinessClass;

    private void specification(CivilAirTransport fly) {
        System.out.println("Гражданский самолет марки " + brand + ", мощность двигателя - " +
                power + " л.с. (" + fly.kWPower() + " кВт/ч), масса - " +
                weight + ", максимальная скорость - " + maxSpeed + ", " +
                "миниальная длина взлетнопосадочной полосы - " + minRunwayLength + ", размах крыльев - "
                + wingspan + ", количество пассажиров - " + numberOfPassengers + ", " +
                "наличие бизнес-класса - " + havingBusinessClass);
    }

    private void load(int passengers) {
        if (numberOfPassengers >= passengers) {
            System.out.println("Самолет загружен");
        } else {
            System.out.println("Вам нужен самолет побольше");
        }
    }
}
