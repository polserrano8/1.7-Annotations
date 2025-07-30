package org.example;

import org.example.model.OnlineWorker;
import org.example.model.PresentialWorker;
import org.example.model.Worker;

public class Main {
    public static void main(String[] args) {
        Worker johnBurrows = new PresentialWorker("John","Burrows",30.0);
        Worker janaMayer = new OnlineWorker("Jana", "Mayer", 50.0);
        System.out.println("The wage of the two workers are...");
        System.out.println("The John Burrows wage is: " + johnBurrows.wageCalculation(200));
        System.out.println("The Jana Mayer wage is: " + janaMayer.wageCalculation(180));
        System.out.println("Both objects have the same method implemented differently, and the results showcases that the override annotation works.");

    }
}