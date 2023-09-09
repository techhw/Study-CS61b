package com.aiguigu;

public class Principle01 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("motor");
        vehicle.run("bus");
        vehicle.run("plane");
    }
}

class Vehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + " running on highway...");
    }
}