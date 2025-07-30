package org.example.model;

public class OnlineWorker extends Worker{
    private final double INTERNETCOSTMONTH = 70;

    private double totalCost;
    public OnlineWorker(String name, String surName, double priceHour){
        super(name,surName,priceHour);
    }
    @Override
    public double wageCalculation(double hoursWorked){
        this.totalCost += (this.getPriceHour() * hoursWorked) + this.INTERNETCOSTMONTH;
        return totalCost;
    };
}
