package org.example.model;

public abstract class Worker {

    private String name;
    private String surName;
    private double priceHour;

    public Worker(String name, String surName, double priceHour){
        this.name = name;
        this.surName = surName;
        this.priceHour = priceHour;
    };

    public abstract double wageCalculation(double hoursWorked);


    public double getPriceHour() {
        return priceHour;
    }

}
