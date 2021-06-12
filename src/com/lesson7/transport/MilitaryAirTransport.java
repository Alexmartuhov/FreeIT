package com.lesson7.transport;

public class MilitaryAirTransport extends AirTransport {
    private boolean catapult;
    private int numberOfRockets;

    private void specification(MilitaryAirTransport fly) {
        System.out.println("Военный самолет марки " + brand + ", мощность двигателя - " +
                power + " л.с. (" + fly.kWPower() + " кВт/ч), масса - " +
                weight + ", максимальная скорость - " + maxSpeed + ", " +
                "миниальная длина взлетнопосадочной полосы - " + minRunwayLength + ", размах крыльев - "
                + wingspan + ", наличие катапульты - " + catapult + ", количество ракет на борту - "
                + numberOfRockets);
    }
    private void shot () {
        if (numberOfRockets > 0) {
            System.out.println("Ракета пошла");
            numberOfRockets-=1;
        } else {
            System.out.println("Боеприпасы отсутствуют");
        }
    }
    private void catapult(){
        if(catapult){
            System.out.println("Катапультирование прошло успешно");
        }else{
            System.out.println("У вас нет такой системы");
        }
    }
}

