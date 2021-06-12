package com.lesson7.transport;

public class FreightTransport extends LandTransport {
    private int carrying;
    private void specification(FreightTransport car) {
        System.out.println("Грузовой автомобиль марки " + brand + ", мощность двигателя - " +
                power + " л.с. (" + kWPower() + " кВт/ч), " + "масса - " +
                weight + ", максимальная скорость - " + maxSpeed + ", " +
                "количество полос - " + numberOfWheel + ", расход топлива - "
                + fuelConsumption + ", грузоподъемность - " + carrying);
    }
    private void load (int loadWeight){
        if(carrying>=loadWeight){
            System.out.println("Грузовик загружен");
        }else{
            System.out.println("Вам нужен грузовик побольше");
        }
    }
}
