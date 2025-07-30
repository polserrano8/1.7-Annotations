package org.example.model;

public class PresentialWorker extends Worker{
    private static double gasolineCostMonth = 50;

    private double totalCost;
    public PresentialWorker(String name, String surName, double priceHour){
        super(name,surName,priceHour);
    }
    @Override
    public double wageCalculation(double hoursWorked){
        this.totalCost += (this.getPriceHour() * hoursWorked) + gasolineCostMonth;
        return totalCost;
    };


}
