package org.example.model;

public class OnlineWorker extends Worker{
    private static double internetCostMonth;
    private int hoursWorked;
    private double totalCost;
    public OnlineWorker(String name, String surName, double priceHour, double internetCostMonth, int hoursWorked){
        super(name,surName,priceHour);
        OnlineWorker.internetCostMonth = internetCostMonth;
        this.hoursWorked = hoursWorked;
    }
    @Override
    public double wageCalculation(){
        this.totalCost += (this.getPriceHour() * hoursWorked) + internetCostMonth;
        return totalCost;
    };
    @Deprecated
    public void wageCalculationExtraShow(){
        System.out.println("The wage of the worker is: " + (this.totalCost + 100) );
    }
}
