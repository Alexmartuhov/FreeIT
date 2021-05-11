package com.Homework9;

import java.util.Random;

public class Car {
    private String brand;
    private int maxSpeed;
    private int price;

    Car(String brand, int maxSpeed, int price) {
        this.price = price;
        this.maxSpeed = maxSpeed;
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getPrice() {
        return price;
    }

    public void setBrend(String brend) {
        this.brand = brand;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void started() throws ExceptionCar {
        Random r = new Random();
        int random = r.nextInt(21);
        if (random != 0 && random % 2 != 0) {
            System.out.println("Машина "+brand+" заведена");
        } else {
            throw new ExceptionCar();
        }
    }

    public static void main(String[] args) {
        Car car1 = new Car("Saab", 240, 15000);
        Car car2 = new Car("Alfa Romeo", 225, 14000);
        Car car3 = new Car("Jaguar", 230, 18000);
        try {
            car1.started();
        }catch(ExceptionCar e){
            System.err.println("Машина "+car1.getBrand()+" не завелась");
            e.printStackTrace();
        }
        try {
            car2.started();
        }catch(ExceptionCar e){
            System.err.println("Машина "+car2.getBrand()+" не завелась");
            e.printStackTrace();
        }
        try {
            car3.started();
        }catch(ExceptionCar e){
            System.err.println("Машина "+car3.getBrand()+" не завелась");
            e.printStackTrace();
        }
    }
}
