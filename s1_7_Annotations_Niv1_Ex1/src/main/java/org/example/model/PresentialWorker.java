package org.example.model;

public class PresentialWorker extends Worker{
    private static double gasolineCostMonth;
    private int hoursWorked;
    private double totalCost;
    public PresentialWorker(String name, String surName, double priceHour, double gasolineCostMonth, int hoursWorked){
        super(name,surName,priceHour);
        PresentialWorker.gasolineCostMonth = gasolineCostMonth;
        this.hoursWorked = hoursWorked;
    }
    @Override
    public double wageCalculation(){
        this.totalCost += (this.getPriceHour() * hoursWorked) + gasolineCostMonth;
        return totalCost;
    };


}
